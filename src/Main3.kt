fun main(){
 val expresion1 = "{a + b [c] * (2x2)}}}"
 val expresion2 = "{ [ a * ( c + d ) ] - 5 }"
 val expresion3 = "{ a * ( c + d ) ] - 5 }"
 val expresion4 =  "{a^4 + (((ax4)}"
 val expresion5 = "{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"
 val expresion6 = "{{{{{{(}}}}}}"
 val expresion7 = "(a"

 println("¿Esta la expresión1 balanceada?: ${ExpresionBalanceada(expresion1)}")
 println("¿Esta la expresión2 balanceada?: ${ExpresionBalanceada(expresion2)}")
 println("¿Esta la expresión3 balanceada?: ${ExpresionBalanceada(expresion3)}")
 println("¿Esta la expresión4 balanceada?: ${ExpresionBalanceada(expresion4)}")
 println("¿Esta la expresión5 balanceada?: ${ExpresionBalanceada(expresion5)}")
 println("¿Esta la expresión6 balanceada?: ${ExpresionBalanceada(expresion6)}")
 println("¿Esta la expresión7 balanceada?: ${ExpresionBalanceada(expresion7)}")

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