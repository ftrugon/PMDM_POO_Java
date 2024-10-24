package ejercicio13

class Anime2(private val nombre: String, private val episodios: Int, private val genero: String) {
    fun mostrarInfo() {
        println("Nombre: $nombre, Episodios: $episodios, Género: $genero")
    }
}

fun main() {
    fun main() {
        print("Dime el nombre del anime: ")
        val nombre = readln()

        print("Dime los capítulos del anime: ")
        val episodios = readln().toInt()

        print("Dime el género del anime: ")
        val genero = readln()

        val animeCreated = Anime2(nombre, episodios, genero)
        animeCreated.mostrarInfo()
    }
}