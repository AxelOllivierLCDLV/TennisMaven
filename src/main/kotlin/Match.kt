class Match(private val firstPlayer: Player, private val secondPlayer: Player) {

    fun getScore(): String {
        return if (firstPlayer.score >= 3 && secondPlayer.score == firstPlayer.score) {
            "Deuce"
        } else if (firstPlayer.score >= 4 && firstPlayer.score - secondPlayer.score <= 1 && firstPlayer.score > secondPlayer.score) {
            "Advantage Player 1"
        } else if (secondPlayer.score >= 4 && secondPlayer.score - firstPlayer.score <= 1 && secondPlayer.score > firstPlayer.score) {
            "Advantage Player 2"
        } else if (firstPlayer.score >= 4 && firstPlayer.score - secondPlayer.score == 2 && firstPlayer.score > secondPlayer.score) {
            "Player 1 wins"
        }else if (secondPlayer.score >= 4 && secondPlayer.score - firstPlayer.score == 2 && secondPlayer.score > firstPlayer.score) {
            "Player 2 wins"
        }else {
            scoreToString(firstPlayer.score) + ", " + scoreToString(secondPlayer.score)
        }
    }

    private fun scoreToString(score: Int): String {
        return when (score) {
            0 -> "Love"
            1 -> "15"
            2 -> "30"
            3 -> "40"
            else -> "ERROR"
        }
    }

    fun firstPlayerScores() {
        this.firstPlayer.scores()
    }

    fun secondPlayerScores() {
        this.secondPlayer.scores()
    }

}
