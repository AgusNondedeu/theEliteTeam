function recursion(idx) {
    console.log(idx)
    setTimeout(() => { recursion(idx + 1) }, 0)
}

recursion(10)