// Destructuring con arrays

let [a, b] = [2, 3]

console.log(a, b)

let [v1, f1] = [100, function() { console.log('hola mundo') }]

f1()

// Destructuring con Objetos

let objeto = {
    nombre: 'Ariel',
    apellido: 'Futur'
}

let {nombre, apellido} = objeto

console.log(nombre, apellido)

