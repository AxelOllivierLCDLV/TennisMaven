enum class Score(val value: Int) {

    LOVE(0),
    FIFTEEN(15),
    THIRTY(30),
    FOURTY(40),
    ADVANTAGE(50),
    WON(1);

    fun next(): Score = enumValues<Score>()[ordinal + 1]
    fun nextToWin(): Score = enumValues<Score>()[ordinal + 2]
    fun previous(): Score = enumValues<Score>()[ordinal - 1]


}