import React from 'react'

function ContadorSimple(props) {
    let [cuenta, setCuenta] = React.useState(props.inicial)

    let incrementar = () => {
        setCuenta(cuenta + props.paso)
    }

    return (
        <>
            <button onClick={incrementar}>{cuenta}</button>
        </>
    )
}

export default ContadorSimple