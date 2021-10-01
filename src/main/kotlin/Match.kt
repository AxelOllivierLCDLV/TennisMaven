class Match(private val firstPlayer: Player, private val secondPlayer: Player) {

    fun getScore(): String {
        return if (firstPlayer.isDeuceWith(secondPlayer)) {
            "Deuce"
        } else if (firstPlayer.hasAdvantageOn(secondPlayer)) {
            "Advantage Player 1"
        } else if (secondPlayer.hasAdvantageOn(firstPlayer)) {
            "Advantage Player 2"
        } else if (firstPlayer.hasWonAgainst(secondPlayer)) {
            "Player 1 wins"
        }else if (secondPlayer.hasWonAgainst(firstPlayer)) {
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
