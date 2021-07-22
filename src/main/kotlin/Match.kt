class Match (val player1: Player, val player2: Player){

    fun incrementPlayersScore(winningPlayer: Player, losingPlayer: Player): Pair<Player, Player> {
        return when (winningPlayer.score) {
            Score.FOURTY -> {
                when (losingPlayer.score) {
                    Score.FOURTY -> {
                        winningPlayer.incrementScore()
                        Pair(winningPlayer, losingPlayer)
                    }
                    Score.ADVANTAGE -> {
                        losingPlayer.decrementScore()
                        Pair(winningPlayer, losingPlayer)
                    }
                    else -> {
                        winningPlayer.incrementScoreToWin()
                        Pair(winningPlayer, losingPlayer)
                    }
                }
            }
            else -> {
                winningPlayer.incrementScore()
                Pair(winningPlayer, losingPlayer)
            }
        }
    }
}
