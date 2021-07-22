class Player (var score: Score = Score.LOVE) {

    fun incrementScore() {this.score = score.next()}
    fun incrementScoreToWin() {this.score = score.nextToWin()}
    fun decrementScore() {this.score = score.previous()}
}