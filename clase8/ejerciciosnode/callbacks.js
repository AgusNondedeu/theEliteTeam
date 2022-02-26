function llamame(fn) {
    for (let idx=0; idx < 5; idx++) {
        setTimeout(()=>fn(idx), idx * 3000)
    }
}

llamame(indice => {
    console.log(indice)
})

