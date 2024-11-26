fun main(){
    val expresion1 = arrayListOf<String>("correr", "saltar", "correr", "saltar", "correr")
    println()
    val expresion2 = arrayListOf<String>("correr", "correr", "correr", "saltar", "correr")
    println()
    val expresion3 = arrayListOf<String>("correr", "correr", "saltar", "saltar", "correr")
    println()
    val expresion4 = arrayListOf<String>("correr", "correr", "saltar", "saltar", "correr")
    println()
    val expresion5 = arrayListOf<String>("correr", "saltar", "correr", "saltar")
    println()
    val expresion6 = arrayListOf<String>("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr")
    println()
    val expresion7 = arrayListOf<String>("saltar", "saltar", "saltar", "saltar", "saltar")
    println()
    val expresion8 = arrayListOf<String>("saltar", "saltar", "saltar", "saltar", "saltar")
    println()
}

fun ExpresionCarrera(movimientos:Array<String>,pista: String): Boolean {
    val pistaMutable = pista.toMutableList()

    for (i in movimientos.indices){
        when{
            movimientos[i]== "correr" && pistaMutable[i] == '_' -> {}
            movimientos[i]== "saltar" && pistaMutable[i] == '|' -> {}
            movimientos[i]== "correr" && pistaMutable[i] == '_' -> {pistaMutable[i]='x'}
            movimientos[i]== "saltar" && pistaMutable[i] == '|' -> {pistaMutable[i]='/'}

        }
    }


    return TODO("Provide the return value")
}