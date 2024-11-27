fun main(){

    val matriz1= arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("O", "X", "O"),
        arrayOf("O", "O", "X")
    )

    val matriz2= arrayOf(
        arrayOf("", "O", "X"),
        arrayOf("", "X", "O"),
        arrayOf("", "O", "X")
    )

    val matriz3= arrayOf(
        arrayOf("O", "O", "O"),
        arrayOf("O", "X", "X"),
        arrayOf("O", "X", "X")
    )

    val matriz4= arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("X", "X", "O"),
        arrayOf("X", "X", "X")
    )

    println(Matriz(matriz1))
    println(Matriz(matriz2))
    println(Matriz(matriz3))
    println(Matriz(matriz4))

}

fun Matriz(matriz: Array<Array<String>>): String{

    return TODO("Provide the return value")
}