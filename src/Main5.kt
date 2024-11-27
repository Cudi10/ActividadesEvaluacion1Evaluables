fun main() {
    val matriz1 = arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("O", "X", "O"),
        arrayOf("O", "O", "X")
    )

    val matriz2 = arrayOf(
        arrayOf("", "O", "X"),
        arrayOf("", "X", "O"),
        arrayOf("", "O", "X")
    )

    val matriz3 = arrayOf(
        arrayOf("O", "O", "O"),
        arrayOf("O", "X", "X"),
        arrayOf("O", "X", "X")
    )

    val matriz4 = arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("X", "X", "O"),
        arrayOf("X", "X", "X")
    )

    println(Matriz(matriz1))
    println(Matriz(matriz2))
    println(Matriz(matriz3))
    println(Matriz(matriz4))
}

fun Matriz(matriz: Array<Array<String>>): String {
    var countX = 0
    var countO = 0
    var countVacios = 0


    for (i in 0..2) {
        for (j in 0..2) {
            when (matriz[i][j]) {
                "X" -> countX++
                "O" -> countO++
                "" -> countVacios++
                else -> return "NulL"
            }
        }
    }


    fun esGanador(symbol: String): Boolean {
        for (i in 0..2) {
            if (matriz[i].all { it == symbol } || matriz.all { it[i] == symbol }) {
                return true
            }
        }

        if ((matriz[0][0] == symbol && matriz[1][1] == symbol && matriz[2][2] == symbol) ||
            (matriz[0][2] == symbol && matriz[1][1] == symbol && matriz[2][0] == symbol)) {
            return true
        }

        return false
    }

    val ganoX = esGanador("X")
    val ganoO = esGanador("O")
    val empate = esGanador("Empate")
    val nulo = esGanador("Null")

    if (ganoX) return "X"

    if (ganoO) return "O"

    if (empate == (countX + countO == 9)) return "Empate"

    if (nulo == ganoX && ganoO) return "NulL"

    return "NulL"
}