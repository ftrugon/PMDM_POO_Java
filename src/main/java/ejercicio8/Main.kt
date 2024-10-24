package ejercicio8

fun main() {
    print("Introduce una frase o alguna palabra, cuento las vocales: ")
    val palabra = readln()

    val dictOfVocals = mutableMapOf<Char, Int>(
        'a' to 0,
        'e' to 0,
        'i' to 0,
        'o' to 0,
        'u' to 0
    )

    for (i in 0 until palabra.length) {
        val character = palabra[i]
        if (dictOfVocals.containsKey(character)) {
            dictOfVocals[character] = dictOfVocals[character]!! + 1
        }
    }

    println("a: ${dictOfVocals['a']}, e: ${dictOfVocals['e']}, i: ${dictOfVocals['i']}, o: ${dictOfVocals['o']}, u: ${dictOfVocals['u']}")

}