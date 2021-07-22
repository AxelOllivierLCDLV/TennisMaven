class Match {

    fun incrementPlayersScore(winningPlayer: Player, losingPlayer: Player): Pair<Player, Player> {
        if (losingPlayer.score == Score.ADVANTAGE) {
            losingPlayer.decrementScore()
        } else if (winningPlayer.score == Score.FOURTY && losingPlayer.score != Score.FOURTY) {
            winningPlayer.incrementScoreToWin()
        } else {
            winningPlayer.incrementScore()
        }
        return Pair(winningPlayer, losingPlayer)
    }
}
