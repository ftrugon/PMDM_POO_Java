package ejercicio5

fun main() {
    print("Introduce un número: ")
    val eleccion = readln().toInt()

    for (i in 0..10) {
        println("$eleccion * $i = ${i * eleccion}")
    }
}