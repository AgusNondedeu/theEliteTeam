import logo from './logo.svg';
import './App.css';
import ContadorComplejo from './ContadorComplejo/ContadorComplejo'
import ContadorSimple from './ContadorSimple/ContadorSimple';


/*
Desafio pasar un numero en las properties
y mosrar ese numero multiplicado por si mismo
*/

function App(props) {
  let cuadrado = x => x * x

  function recibirEvento() {
    alert('estoy en recibir evento')
  }

  return (
    <>
        <h1>{props.titulo} {cuadrado(props.n)} </h1>
        <hr />
        <ContadorSimple inicial={10} paso={3} cuandoHaceClick={recibirEvento}></ContadorSimple>
        <ContadorSimple inicial={10} paso={5} cuandoHaceClick={recibirEvento}></ContadorSimple>
        <hr />
        <ContadorComplejo valores={[5,4,3,2,1]}></ContadorComplejo>
    </>
  );
}
/*
// <ContadorComplejo></ContadorComplejo>
*/

export default App;
