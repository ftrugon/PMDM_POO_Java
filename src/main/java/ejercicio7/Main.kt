package ejercicio7

fun main() {
    print("Introduce una frase o alguna palabra, te la doy al revés: ")
    val palabra = readln()

    var reversedWord = palabra.reversed()

    println(reversedWord)
}