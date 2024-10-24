package ejercicio11

fun main() {
    print("¿Cuántos números quieres que tenga la función de Fibonacci?: ")
    val limit = readln().toInt()

    var num = 1
    var numAnterior = 0
    var cadena = ""

    for (i in 0..limit) {
        cadena += "$numAnterior + "

        val temp = num
        num = numAnterior + num
        numAnterior = temp
    }

    if (cadena.endsWith(" + ")) {
        cadena = cadena.substring(0, cadena.length - 3)
    }

    println(cadena)

}