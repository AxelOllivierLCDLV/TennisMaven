fun main(args: Array<String>) {
    println("Hello World!")
}

fun incrementScore(oldScore: Int): Int {
    return if (oldScore == 30) {
        40
    }
        else {
            oldScore + 15
    }
}