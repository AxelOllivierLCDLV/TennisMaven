class Match (val player1: Player, val player2: Player){

    fun incrementScorePlayer1(winningPlayer: Player, losingPlayer: Player): Pair<Score, Score> {
        return when (winningPlayer.score) {
            Score.THIRTY -> {
                Pair(Score.FOURTY, losingPlayer.score)
            }
            Score.ADVANTAGE -> {
                Pair(Score.WON, losingPlayer.score)
            }
            Score.FOURTY -> {
                when (losingPlayer.score) {
                    Score.FOURTY -> {
                        Pair(Score.ADVANTAGE, losingPlayer.score)
                    }
                    Score.ADVANTAGE -> {
                        Pair(Score.FOURTY, Score.FOURTY)
                    }
                    else -> {
                        Pair(Score.WON, losingPlayer.score)
                    }
                }
            }
            else -> {
                Pair(winningPlayer.score.next(), losingPlayer.score)
            }
        }
    }


}
