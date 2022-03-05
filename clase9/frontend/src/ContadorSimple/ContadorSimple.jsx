import React from 'react'
import './estilo.css'

function ContadorSimple(props) {
    let [cuenta, setCuenta] = React.useState(props.inicial)

    let incrementar = () => {
        setCuenta(cuenta + props.paso)
        if (props?.cuandoHaceClick) {
            props.cuandoHaceClick()
        }
    }

    return (
        <>
            <button className="espacio" onClick={incrementar}>{cuenta}</button>
        </>
    )
}

export default ContadorSimple