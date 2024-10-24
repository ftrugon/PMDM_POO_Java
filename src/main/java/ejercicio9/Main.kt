package ejercicio9

fun main() {
    print("Introduce un número, te digo si es primo: ")
    val num = readln().toInt()

    var posibleDivs = 0

    for (i in 1..num) {
        if (num % i == 0) posibleDivs++
    }

    if (posibleDivs == 2 || num == 1) {
        println("El número es primo")
    } else {
        println("El número no es primo")
    }

}