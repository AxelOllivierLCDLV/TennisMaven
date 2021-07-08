fun main(args: Array<String>) {
    println("Hello World!")
}

fun incrementScore(winnerScore: Int, opponentScore: Int): Pair<Int, Int> {
    return when (winnerScore) {
        30 -> {
            Pair(40, opponentScore)
        }
        50 -> {
            Pair(1, opponentScore)
        }
        40 -> {
            when (opponentScore) {
                40 -> {
                    Pair(50, opponentScore)
                }
                50 -> {
                    Pair(40, 40)
                }
                else -> {
                    Pair(1, opponentScore)
                }
            }
        }
        else -> {
            Pair(winnerScore + 15, opponentScore)
        }
    }
}

fun compareScore(score: Int, score1: Int): Boolean {
    return score == score1 && score == 40
}