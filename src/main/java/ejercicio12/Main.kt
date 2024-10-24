package ejercicio12

fun main() {
    print("Introduce un número, te lo doy al revés: ")
    val palabra = readln()

    var reversedWord = palabra.reversed().toInt()

    println(reversedWord)
}