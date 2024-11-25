fun main() {

    for (num in 1 .. 100) {

        if (num % 3 == 0 && num % 5 == 0) {
            println("triqui")
        } else if (num % 3 == 0) {
            println("tri")
        } else if (num % 5 == 0) {
            println("qui")
        } else {
            println(num)

        }
    }
}