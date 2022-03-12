function traerTodosLosAlumnos(onFinish) {
    fetch('/api/v1/alumno/')
    .then(z => z.json())
    .then(onFinish)
}

function traerUnAlumno(id, onFinish) {
    let url = ['/api/v1/alumno', id].join('/')
    fetch(url)
    .then(z => z.json())
    .then(onFinish)
}

window.traerTodosLosAlumnos = traerTodosLosAlumnos
window.traerUnAlumno = traerUnAlumno

export default {
    traerTodosLosAlumnos,
    traerUnAlumno
}