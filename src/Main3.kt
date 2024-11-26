fun main(){

}

fun ExpresionBalanceada(expresion: String): Boolean {
    val pila = mutableListOf<Char>()

    for (caracter in expresion) {
        when (caracter) {
            '(', '{', '[' -> {
                pila.add(caracter)
            }

            ')', '}', ']' -> {
                if (pila.isEmpty()) {
                    return false
                }

                val top = pila.removeAt(pila.size - 1)

                if (((caracter == ')') && (top != '(')) ||
                    ((caracter == '}') && (top != '{')) ||
                    ((caracter == ']') && (top != '['))
                ) {
                    return false
                }
            }
        }
    }

    return pila.isEmpty()

}