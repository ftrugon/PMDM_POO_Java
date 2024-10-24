package ejercicio2

fun main() {
    print("Introduce un número: ")
    val num = readln().toInt()

    if (num % 2 == 0) {
        println("El número es par")
    } else {
        println("El número es impar")
    }
}