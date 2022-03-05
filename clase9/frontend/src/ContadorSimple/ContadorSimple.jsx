import React from 'react'
import './estilo.css'

function ContadorSimple(props) {
    let [cuenta, setCuenta] = React.useState(props.inicial)

    let incrementar = () => {
        let total = cuenta + props.paso
        setCuenta(total)
        if (props?.cuandoHaceClick) {
            props.cuandoHaceClick(total)
        }
    }

    return (
        <>
            <button className="espacio" onClick={incrementar}>{cuenta}</button>
        </>
    )
}

export default ContadorSimple