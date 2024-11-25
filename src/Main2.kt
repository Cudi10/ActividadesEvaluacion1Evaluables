fun main(){

    println("Introduzca una palabra:")

    println("Introduzca otra palabra:")

}

fun Anagramas(palabra1: String, palabra2: String): Boolean {
    val pala1 = palabra1.replace(" ", "").lowercase()
    val pala2 = palabra2.replace(" ", "").lowercase()

    if (pala1.length != pala2.length) {
        return false
    }

    return pala1.toList().sorted() == pala2.toList().sorted()
}