import logo from './logo.svg';
import './App.css';
import ContadorComplejo from './ContadorComplejo/ContadorComplejo'
import ContadorSimple from './ContadorSimple/ContadorSimple';
import { NavLink, Route, Routes, Redirect, Switch, BrowserRouter } from 'react-router-dom'
import ComponenteAzul from './ComponenteAzul/ComponenteAzul'
import ComponenteRojo from './ComponenteRojo/ComponenteRojo'
import Menu from './Menu/Menu'

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
                <Route path="/rojo" element={<ComponenteRojo />}></Route>
                <Route path="azul" element={<ComponenteAzul />}></Route>
                <Route path="contador" element={<ComponerContadorComplejo />}></Route>
            </Routes>
        </BrowserRouter>
      </>
      )
  }

  return (
    <>
        <h1>{props.titulo}</h1>
        <Menu></Menu>
        <Rutas></Rutas>
    </>
  );
}
/*
// <ContadorComplejo></ContadorComplejo>
*/

export default App;
