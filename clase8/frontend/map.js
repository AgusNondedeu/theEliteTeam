let arr = [1, 'hola', new Date(), 'chau', 10, false]

let arrModificado = arr.map(item => {
    return ['<h1>', item, '</h1>', '<br />'].join('')
})

arrModificado.forEach(z => {
    console.log(z)
})


