class Match (val player1: Player, val player2: Player){

    fun incrementScorePlayer1(player1: Player, player2: Player): Pair<Score, Score> {
        return when (player1.score) {
            Score.THIRTY -> {
                Pair(Score.FOURTY, player2.score)
            }
            Score.AVANTAGE -> {
                Pair(Score.WON, player2.score)
            }
            Score.FOURTY -> {
                when (player2.score) {
                    Score.FOURTY -> {
                        Pair(Score.AVANTAGE, player2.score)
                    }
                    Score.AVANTAGE -> {
                        Pair(Score.FOURTY, Score.FOURTY)
                    }
                    else -> {
                        Pair(Score.WON, player2.score)
                    }
                }
            }
            else -> {
                Pair(player1.score.next, player2.score)
            }
        }
    }


}
