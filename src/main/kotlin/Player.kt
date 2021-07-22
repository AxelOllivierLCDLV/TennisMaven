class Player (var score: Score = Score.LOVE) {

    fun incrementScore() {this.score = score.next()}

    fun decrementScore() {this.score = score.previous()}
}