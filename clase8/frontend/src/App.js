import logo from './logo.svg';
import './App.css';
import ContadorComplejo from './ContadorComplejo/ContadorComplejo'

/*
Desafio pasar un numero en las properties
y mosrar ese numero multiplicado por si mismo
*/

function App(props) {
  let cuadrado = x => x * x
  return (
    <>
        <h1>{props.titulo} {cuadrado(props.n)} </h1>
        <hr></hr>
        <ContadorComplejo></ContadorComplejo>
        <hr></hr>
    </>
  );
}

export default App;
