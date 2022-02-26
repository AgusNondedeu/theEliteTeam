import logo from './logo.svg';
import './App.css';

/*
Desafio pasar un numero en las properties
y mosrar ese numero multiplicado por si mismo
*/

function App(props) {
  return (
    <>
        <h1>{props.titulo}</h1>
    </>
  );
}

export default App;
