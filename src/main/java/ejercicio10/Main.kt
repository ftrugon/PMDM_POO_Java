package ejercicio10

fun main() {
    val eleccion = impMenu()
    println("Ahora dime el numero que quieres transformar: ")
    val num = readln().toFloat()

    when (eleccion) {
        1 -> println(num * 9 / 5 + 32)
        2 -> println((num - 32) * 5 / 9)
        else -> println("Numero introducido no valido")
    }
}

fun impMenu(): Int {
    println("¿Qué conversión quieres hacer?: ")
    println("1. Celsius a Fahrenheit")
    println("2. Fahrenheit a Celsius")
    return readln().toInt()
}
