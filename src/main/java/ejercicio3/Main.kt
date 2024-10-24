package ejercicio3

import kotlin.math.pow

fun main() {
    print("Introduce un número: ")
    val num = readln().toFloat()

    val area = (Math.PI * num.toDouble().pow(2.0)).toFloat()

    println("El área del círculo es de $area")
}