import logo from './logo.svg';
import './App.css';
import ContadorComplejo from './ContadorComplejo/ContadorComplejo'
import ContadorSimple from './ContadorSimple/ContadorSimple';
import { NavLink, Route, Routes, Redirect, Switch, BrowserRouter } from 'react-router-dom'
import ComponenteAzul from './ComponenteAzul/ComponenteAzul'
import ComponenteRojo from './ComponenteRojo/ComponenteRojo'
import Menu from './Menu/Menu'
import proxy from './proxy'
import Alumnos from './Alumnos/Alumnos'
import RenderAlumno from './RenderAlumno/RenderAlumno'
import Ejemplo from './Ejemplo/Ejemplo';

/*
Desafio pasar un numero en las properties
y mosrar ese numero multiplicado por si mismo
*/

function App(props) {
  let cuadrado = x => x * x

  function recibirEvento() {
    alert('estoy en recibir evento')
  }

  function ComponerContadorComplejo() {
      return (
        <>
            <hr />
            <ContadorComplejo valores={[5,4,3,2,1]}></ContadorComplejo>
        </>
      )
  }

  function Rutas() {
      return (
      <>
        <BrowserRouter>
            <Routes>
                <Route path="rojo" element={<ComponenteRojo />}></Route>
                <Route path="azul" element={<ComponenteAzul />}></Route>
                <Route path="contador" element={<ComponerContadorComplejo />}></Route>
                <Route path="alumnos/:id" element={<RenderAlumno />}></Route>
                <Route path="alumnos" element={<Alumnos />}></Route>
                <Route path="ejemplo" element={<Ejemplo />}></Route>
            </Routes>
        </BrowserRouter>
      </>
      )
  }

  return (
    <>
        <h1>{props.titulo}</h1>
        <br />
        <Menu></Menu>
        <Rutas></Rutas>
    </>
  );
}
/*
// <ContadorComplejo></ContadorComplejo>
*/

export default App;
