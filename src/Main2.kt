fun main(){

    print("Introduce la primera palabra: ")
    val palabra1 = readLine() ?: ""
    print("Introduce la segunda palabra: ")
    val palabra2 = readLine() ?: ""

    if (Anagramas(palabra1, palabra2)) {
        println("Las palabras '$palabra1' y '$palabra2' SON anagramas.")
    } else {
        println("Las palabras '$palabra1' y '$palabra2' NO son anagramas.")
    }
}

fun Anagramas(palabra1: String, palabra2: String): Boolean {
    val pala1 = palabra1.replace(" ", "").lowercase()
    val pala2 = palabra2.replace(" ", "").lowercase()

    if (pala1.length != pala2.length) {
        return false
    }

    return pala1.toList().sorted() == pala2.toList().sorted()
}