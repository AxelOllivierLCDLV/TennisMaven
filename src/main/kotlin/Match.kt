class Match (val player1: Player, val player2: Player){

    fun incrementScorePlayer1(player1: Player, player2: Player): Pair<Int, Int> {
        return when (player1.score.value) {
            30 -> {
                Pair(40, player2.score.value)
            }
            50 -> {
                Pair(1, player2.score.value)
            }
            40 -> {
                when (player2.score.value) {
                    40 -> {
                        Pair(50, player2.score.value)
                    }
                    50 -> {
                        Pair(40, 40)
                    }
                    else -> {
                        Pair(1, player2.score.value)
                    }
                }
            }
            else -> {
                Pair(player1.score.value + 15, player2.score.value)
            }
        }
    }

    fun incrementScorePlayer2(player1: Int, player2: Int): Pair<Int, Int> {
        return when (player2) {
            30 -> {
                Pair(player1, 40)
            }
            50 -> {
                Pair(player1, 1)
            }
            40 -> {
                when (player1) {
                    40 -> {
                        Pair(player1, 50)
                    }
                    50 -> {
                        Pair(player1, 40)
                    }
                    else -> {
                        Pair(player1, 1)
                    }
                }
            }
            else -> {
                Pair(player1, player2 + 15)
            }
        }
    }

}
