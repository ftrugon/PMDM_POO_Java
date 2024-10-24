package ejercicio14

class Videojuego2(private val titulo: String, private val plataforma: String, private val horasJugadas: Int) {
    fun mostrarInfo() {
        println("Título: $titulo, Plataforma: $plataforma, Horas jugadas: $horasJugadas")
    }

    fun getTitulo(): String {
        return titulo
    }
}

class InventarioVideojuegos2 {
    private val inventario = mutableListOf<Videojuego2>()

    fun agregarVideojuego(videojuego: Videojuego2) {
        val existe = inventario.any { it.getTitulo() == videojuego.getTitulo() }

        if (existe) {
            println("El juego que intentas insertar ya existe en el inventario")
        } else {
            inventario.add(videojuego)
        }
    }

    fun eliminarVideojuego(titulo: String) {
        val juegoToDestroy = inventario.find { it.getTitulo() == titulo }

        if (juegoToDestroy != null) {
            inventario.remove(juegoToDestroy)
        } else {
            println("El juego que has introducido no existe")
        }
    }

    fun mostrarJuegos() {
        for (juego in inventario) {
            juego.mostrarInfo()
        }
    }
}

fun main() {
    val inventario = InventarioVideojuegos()
    var opcion: Int

    do {
        println("\n--- Menú de Inventario de Videojuegos ---")
        println("1. Añadir videojuego")
        println("2. Eliminar videojuego")
        println("3. Mostrar inventario")
        println("4. Salir")
        print("Elige una opción: ")
        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                print("Dime el título del videojuego: ")
                val titulo = readLine()!!
                print("Dime la plataforma del videojuego: ")
                val plataforma = readLine()!!
                print("Dime las horas jugadas del videojuego: ")
                val horasJugadas = readLine()!!.toInt()

                val videojuego = Videojuego(titulo, plataforma, horasJugadas)
                inventario.agregarVideojuego(videojuego)
            }
            2 -> {
                print("Dime el título del videojuego a eliminar: ")
                val tituloEliminar = readLine()!!
                inventario.eliminarVideojuego(tituloEliminar)
            }
            3 -> inventario.mostrarJuegos()
            4 -> println("Saliendo del programa...")
            else -> println("Opción no válida, intenta de nuevo.")
        }

    } while (opcion != 4)
}
