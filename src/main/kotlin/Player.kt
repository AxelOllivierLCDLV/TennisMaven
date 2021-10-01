class Player(var score: Int = 0) {

    fun scores() {
        this.score = score + 1
    }

    fun hasAdvantageOn(otherPlayer: Player) : Boolean{
        return this.score >= 4 && this.score - otherPlayer.score <= 1 && this.score > otherPlayer.score
    }

    fun hasWonAgainst(otherPlayer: Player): Boolean {
        return this.score >= 4 && this.score - otherPlayer.score == 2 && this.score > otherPlayer.score
    }

    fun isDeuceWith(otherPlayer: Player): Boolean {
        return this.score >= 3 && otherPlayer.score == this.score
    }

}