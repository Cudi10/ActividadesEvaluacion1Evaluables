fun main(){
    val expresion1 = arrayListOf<String>("correr", "saltar", "correr", "saltar", "correr")
    val pista1= "_|_|_"
    println("Resultado para $expresion1 en pista $pista1 -> ${ExpresionCarrera(expresion1.toArray(arrayOf<String>()), pista1)}")

    val expresion2 = arrayListOf<String>("correr", "correr", "correr", "saltar", "correr")
    val pista2= "_|_|_"
    println("Resultado para $expresion2 en pista $pista2 -> ${ExpresionCarrera(expresion2.toArray(arrayOf<String>()), pista2)}")

    val expresion3 = arrayListOf<String>("correr", "correr", "saltar", "saltar", "correr")
    val pista3= "_|_|_"
    println("Resultado para $expresion3 en pista $pista3 -> ${ExpresionCarrera(expresion3.toArray(arrayOf<String>()), pista3)}")

    val expresion4 = arrayListOf<String>("correr", "correr", "saltar", "saltar", "correr")
    val pista4= "_|_|_|_"
    println("Resultado para $expresion4 en pista $pista4 -> ${ExpresionCarrera(expresion4.toArray(arrayOf<String>()), pista4)}")

    val expresion5 = arrayListOf<String>("correr", "saltar", "correr", "saltar")
    val pista5= "_|_|_"
    println("Resultado para $expresion5 en pista $pista5 -> ${ExpresionCarrera(expresion5.toArray(arrayOf<String>()), pista5)}")

    val expresion6 = arrayListOf<String>("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr")
    val pista6= "_|_|_"
    println("Resultado para $expresion6 en pista $pista6 -> ${ExpresionCarrera(expresion6.toArray(arrayOf<String>()), pista6)}")

    val expresion7 = arrayListOf<String>("saltar", "saltar", "saltar", "saltar", "saltar")
    val pista7= "|||||"
    println("Resultado para $expresion7 en pista $pista7 -> ${ExpresionCarrera(expresion7.toArray(arrayOf<String>()), pista7)}")

    val expresion8 = arrayListOf<String>("saltar", "saltar", "saltar", "saltar", "saltar")
    val pista8= "||_||"
    println("Resultado para $expresion8 en pista $pista8 -> ${ExpresionCarrera(expresion8.toArray(arrayOf<String>()), pista8)}")
}

fun ExpresionCarrera(movimientos: Array<String>, pista: String): Boolean {
    if (movimientos.size != pista.length) {
        println("Error: Los movimientos no coinciden con la pista.")
        return false
    }

    val pistaMutable = pista.toMutableList()

    for (i in movimientos.indices) {
        when {
            movimientos[i] == "correr" && pistaMutable[i] == '_' -> continue
            movimientos[i] == "saltar" && pistaMutable[i] == '|' -> continue
            movimientos[i] == "saltar" && pistaMutable[i] == '_' -> pistaMutable[i] = 'x'
            movimientos[i] == "correr" && pistaMutable[i] == '|' -> pistaMutable[i] = '/'
            else -> pistaMutable[i] = '?'
        }
    }

    println("Pista modificada: ${pistaMutable.joinToString("")}")

    return !pistaMutable.contains('?')
}