fun main(){
    println(ExpresionCarrera(arrayOf("correr", "saltar", "correr", "saltar", "correr"), "_|_|_"))

    println(ExpresionCarrera(arrayOf("correr", "correr", "correr", "saltar", "correr"), "_|_|_"))

    println(ExpresionCarrera(arrayOf("correr", "correr", "saltar", "saltar", "correr"), "_|_|_"))

    println(ExpresionCarrera(arrayOf("correr", "correr", "saltar", "saltar", "correr"), "_|_|_|_"))

    println(ExpresionCarrera(arrayOf("correr", "saltar", "correr", "saltar"), "_|_|_"))

    println(ExpresionCarrera(arrayOf("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr"), "_|_|_"))

    println(ExpresionCarrera(arrayOf("saltar", "saltar", "saltar", "saltar", "saltar"), "|||||"))

    println(ExpresionCarrera(arrayOf("saltar", "saltar", "saltar", "saltar", "saltar"), "||_||"))
}

fun ExpresionCarrera(movimientos: Array<String>, pista: String): Boolean {
    if (movimientos.size != pista.length) {
        return false
    }

    val pistaMutable = pista.toMutableList()

    for (i in movimientos.indices) {
        when {
            movimientos[i] == "correr" && pistaMutable[i] == '_' -> {}
            movimientos[i] == "saltar" && pistaMutable[i] == '|' -> {}
            movimientos[i] == "saltar" && pistaMutable[i] == '_' -> {
                pistaMutable[i] = 'x' }
            movimientos[i] == "correr" && pistaMutable[i] == '|' -> {
                pistaMutable[i] = '/' }
            else -> {
                pistaMutable[i] = '?'
            }
        }
    }

    return pistaMutable.joinToString("") == pista
}