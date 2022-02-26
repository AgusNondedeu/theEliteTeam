import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import ContadorSimple from './ContadorSimple/ContadorSimple'

ReactDOM.render(
  <React.StrictMode>
    <App titulo="Cantidad de ejercicios resuletos" n='10' />
    <ContadorSimple inicial={10} paso={3}></ContadorSimple>
    <ContadorSimple inicial={10} paso={5}></ContadorSimple>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
