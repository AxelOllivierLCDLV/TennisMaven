fun main(args: Array<String>) {
    println("Hello World!")
}

fun incrementScore(oldScore: Int): Int {
    return if (oldScore == 30) {
        40
    }
    else if (oldScore == 40) {
        1
    }
        else {
            oldScore + 15
    }
}

fun compareScore(score: Int, score1: Int): Boolean {
    return score == score1 && score == 40
}