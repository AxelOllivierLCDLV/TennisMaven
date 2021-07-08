fun main(args: Array<String>) {
    println("Hello World!")
}

fun incrementScore(winnerScore: Int, opponentScore: Int): Int {
    return if (winnerScore == 30) {
        40
    }
    else if (winnerScore == 40) {
        if (opponentScore == 40 ){
            50
        }

        else {
            1
        }

    }
        else {
            winnerScore + 15
    }
}

fun compareScore(score: Int, score1: Int): Boolean {
    return score == score1 && score == 40
}