package ejercicio4

import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(0, 100)

    print("Introduce un número: ")
    var eleccion = readln().toInt()

    do {
        if (eleccion > randomNumber) {
            println("El número introducido es mayor al aleatorio")
        } else if (eleccion < randomNumber) {
            println("El número introducido es menor al aleatorio")
        }
        eleccion = readLine()!!.toInt()
    } while (randomNumber != eleccion)
}