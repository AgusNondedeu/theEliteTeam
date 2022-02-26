let tr = z => console.log(z)

function laVoyAInvocarDeFormaAsync() {
    tr('Esta fue invocada de forma async')
}

function m5() {
    tr('Llegue a m5')
    for (let idx = 1; idx < 1000000; idx++) {
        for (let id2 = 1; id2 < 10000; id2++) {

        }
    }
    setTimeout(laVoyAInvocarDeFormaAsync, 0)
    // throw new Error('Se produjo un error en m5')
}

function m4() {
    tr('Antes de llamar a m3')
    m5()
    tr('Despues de llamar a m3')
}

function m3() {
    tr('Antes de llamar a m3')
    m4()
    tr('Despues de llamar a m3')
}

function m2() {
    tr('Antes de llamar a m3')
    m3()
    tr('Despues de llamar a m3')
}

function m1() {
    tr('Antes de llamar a m2')
    m2()
    tr('Despues de llamar a m2')
}

{
    try {
        m1()
    }
    catch (err) {
        tr(err)
    }
}