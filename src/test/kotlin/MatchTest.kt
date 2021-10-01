import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MatchTest {

    @Test
    fun `should display score of love, love at start`(){
        val match = Match(Player(), Player())
        val expectedScore = "Love, Love"

        val actualScore = match.getScore()

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should display score of 15, love after first player scores`(){
        val match = Match(Player(), Player())
        val expectedScore = "15, Love"

        match.firstPlayerScores()

        val actualScore = match.getScore()

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should display score of love, 15 after second player scores`(){
        val match = Match(Player(), Player())
        val expectedScore = "Love, 15"

        match.secondPlayerScores()
        val actualScore = match.getScore()

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should display score of 40, 30 when first player scored 3 times and second player 2 times`() {
        val match = Match(Player(3), Player(2))
        val expectedScore = "40, 30"

        val actualScore = match.getScore()

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should display score of deuce when both players have 40 points`() {
        val match = Match(Player(3), Player(3))
        val expectedScore = "Deuce"

        val actualScore = match.getScore()

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should display score of advantage player 1 when player 1 has advantage`() {
        val match = Match(Player(4), Player(3))
        val expectedScore = "Advantage Player 1"

        val actualScore = match.getScore()

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should display score of advantage player 2 when player 2 has advantage`() {
        val match = Match(Player(5), Player(6))
        val expectedScore = "Advantage Player 2"

        val actualScore = match.getScore()

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should display score of player 1 wins when player 1 wins`() {
        val match = Match(Player(5), Player(3))
        val expectedScore = "Player 1 wins"

        val actualScore = match.getScore()

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should display score of player 2 wins when player 2 wins`() {
        val match = Match(Player(6), Player(8))
        val expectedScore = "Player 2 wins"

        val actualScore = match.getScore()

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should set back the score to deuce when the player with advantage didn't win the point`() {
        val match = Match(Player(6), Player(7))
        val expectedOldScore = "Advantage Player 2"
        val expectedNewScore = "Deuce"

        val actualOldScore = match.getScore()
        match.firstPlayerScores()
        val actualNewScore = match.getScore()

        assertEquals(expectedOldScore, actualOldScore)
        assertEquals(expectedNewScore, actualNewScore)
    }
}