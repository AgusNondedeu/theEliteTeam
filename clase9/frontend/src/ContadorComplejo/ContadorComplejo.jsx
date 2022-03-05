import React from 'react'
import ContadorSimple from '../ContadorSimple/ContadorSimple'

function ContadorComplejo(props) {
    let [cuenta, setCuenta] = React.useState(0)
    let arrValores = props.valores

    {
        cuenta = calcularTotal(arrValores)
    }

    function calcularTotal(unArray) {
        let total = arrValores.reduce((acum, item) => {
            return acum + item
        }, 0)
        return total
    }

    function volverAsetearCuenta() {
        setCuenta(calcularTotal(arrValores))
    }

    function eventoRecalcularTotal(idx, totalItem) {
        arrValores[idx] = totalItem
        console.log(arrValores)
        volverAsetearCuenta()
    }

    function ComponenteVariosBotones() {
        return arrValores.map((vs, idx) => {
            return (
                <>
                <ContadorSimple key={idx} inicial={vs} paso={idx} cuandoHaceClick={(totalItem) => eventoRecalcularTotal(idx, totalItem)}>
                </ContadorSimple>
                </>
            )
        })
    }

    return (
        <>
            <ComponenteVariosBotones valores={props.valores}></ComponenteVariosBotones>
            <hr />
            <h1>Suma Total: {cuenta}</h1>
        </>
    )
}

export default ContadorComplejo