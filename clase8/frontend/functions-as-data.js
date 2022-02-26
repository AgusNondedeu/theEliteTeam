/*
Functions as data es como el ABC de la programacion funcional
Que argumentos de una funcion, pueden ser funciones
y retornos o returns de una funcion pueden ser funciones
*/

function operaDosYTres(operador) {
    return operador(2, 3)
}

console.log(operaDosYTres(function(a,b) { return a - b }))
console.log(operaDosYTres((z1, z2) => z1 + z2 ))


