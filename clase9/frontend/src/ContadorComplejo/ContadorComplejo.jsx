import React from 'react'
import ContadorSimple from '../ContadorSimple/ContadorSimple'

function ContadorComplejo(props) {

    /*
    Hacer un nuevo componente que se llame ComponenteMuestraTexto
    que se base en un array que recibo con el nombre de props.textos
    Simplemente mostrar esos textos separados por <hr />
    recordar que cuando llamo a <ContadorComplejo textos={["hola", "que", "tal"]} >
    RECORDAR UTILIZAR EL MAP
    */

    function ComponenteVariosBotones() {
        return props.valores.map((vs, idx) => {
            return (
                <>
                <ContadorSimple key={idx} inicial={vs} paso={idx} cuandoHaceClick={()=>{}}>
                </ContadorSimple>
                </>
            )
        })
    }

    return (
        // DEBAJO DEL COMPONENTE VARIOS BOTONES AGREGAR EL NUEVO COMPONENTE
        <>
            <ComponenteVariosBotones valores={props.valores}></ComponenteVariosBotones>
        </>
    )
}

export default ContadorComplejo