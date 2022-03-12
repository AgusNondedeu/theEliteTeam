import React from 'react'
import proxy from '../proxy.js'
import '../../node_modules/bootstrap/dist/css/bootstrap.css'

function RenderFilas(props) {
    let arrFilas = props.alumnos

    return arrFilas.map(alumno => (
        <tr key={alumno.id} scope="row">
            <td><a href={'/alumnos/' + alumno.id}>{alumno.id}</a></td>
            <td>{alumno.nombre}</td>
            <td>{alumno.apellido}</td>
            <td>{alumno.pais}</td>
        </tr>
    ))
}

function Alumnos() {
    let [efecto, setEfecto] = React.useState('el efecto')
    let [arrAlumnos, setArrAlumnos] = React.useState([])

    React.useEffect(() => {
        proxy.traerTodosLosAlumnos(datos => {
            if (datos.status != 'OK') {
                return
            }
            setArrAlumnos(datos.resultado)
        })
    }, [efecto])

    window.setEfecto = setEfecto

    return (
        <>
        <table className="table">
        <thead>
            <tr>
                <th scope="col">id</th>
                <th scope="col">Nombre</th>
                <th scope="col">Apellido</th>
                <th scope="col">Pais</th>
            </tr>
        </thead>
        <tbody>
            <RenderFilas alumnos={arrAlumnos} />
        </tbody>
        </table>
        </>
    )
}

export default Alumnos