let fetchUrl = require('fetch').fetchUrl

let url = 'http://localhost:8080/inventaralumnos'

fetchUrl(url, (err, headers, body) => {
    console.log(err)
    console.log(headers)
    console.log(body.toString())
})