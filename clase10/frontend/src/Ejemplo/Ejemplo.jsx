import React from 'react'

export default () => {
    let [anchoBrowser, setAnchoBrowser] = React.useState(window.innerWidth)

    let cambiarTamanio = () => {
        setAnchoBrowser(window.innerWidth)
    }

    React.useEffect(() => {
        window.addEventListener('resize', cambiarTamanio)
        return () => {
            // window.removeEventListener('resize')
        }
    })

    return (
        <>
        <h1>{anchoBrowser}</h1>
        </>
    )
}