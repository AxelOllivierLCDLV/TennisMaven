import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PlayerTest {

    @Test
    fun `should create the player with a score of 0`() {
        val player = Player()
        val expectedScore = 0

        assertEquals(expectedScore, player.score)
    }

    @Test
    fun `should increment the player score to 1`() {
        val player = Player()
        val expectedScore = 1

        player.scores()

        assertEquals(expectedScore, player.score)
    }

    @Test
    fun `should return true when the player has advantage on the other one`() {
        val firstPlayer = Player(4)
        val secondPlayer = Player(3)

        val hasAdvantage = firstPlayer.hasAdvantageOn(secondPlayer)

        assertTrue(hasAdvantage)
    }

    @Test
    fun `should return false when the players are deuce`() {
        val firstPlayer = Player(4)
        val secondPlayer = Player(4)

        val hasAdvantage = firstPlayer.hasAdvantageOn(secondPlayer)

        assertFalse(hasAdvantage)
    }

    @Test
    fun `should return false when the first player have one more point than the other but less than 3`() {
        val firstPlayer = Player(1)
        val secondPlayer = Player(0)

        val hasAdvantage = firstPlayer.hasAdvantageOn(secondPlayer)

        assertFalse(hasAdvantage)
    }

    @Test
    fun `should return false when the other player has advantage`() {
        val firstPlayer = Player(3)
        val secondPlayer = Player(4)

        val hasAdvantage = firstPlayer.hasAdvantageOn(secondPlayer)

        assertFalse(hasAdvantage)
    }

    @Test
    fun `should return true when the player won`() {
        val firstPlayer = Player(5)
        val secondPlayer = Player(3)

        val hasWon = firstPlayer.hasWonAgainst(secondPlayer)

        assertTrue(hasWon)
    }

    @Test
    fun `should return false for winning when the players are deuce`() {
        val firstPlayer = Player(4)
        val secondPlayer = Player(4)

        val hasWon = firstPlayer.hasWonAgainst(secondPlayer)

        assertFalse(hasWon)
    }

    @Test
    fun `should return false when the first player have two more point than the other but less than 3`() {
        val firstPlayer = Player(2)
        val secondPlayer = Player(0)

        val hasWon = firstPlayer.hasWonAgainst(secondPlayer)

        assertFalse(hasWon)
    }

    @Test
    fun `should return false when the other player wins`() {
        val firstPlayer = Player(2)
        val secondPlayer = Player(5)

        val hasWon = firstPlayer.hasWonAgainst(secondPlayer)

        assertFalse(hasWon)
    }

    @Test
    fun `should return false when players are not deuce with different scores`() {
        val firstPlayer = Player(2)
        val secondPlayer = Player(5)

        val isDeuce = firstPlayer.isDeuceWith(secondPlayer)

        assertFalse(isDeuce)
    }

    @Test
    fun `should return false when players are not deuce with same scores`() {
        val firstPlayer = Player(2)
        val secondPlayer = Player(2)

        val isDeuce = firstPlayer.isDeuceWith(secondPlayer)

        assertFalse(isDeuce)
    }

    @Test
    fun `should return true when players are deuce`() {
        val firstPlayer = Player(7)
        val secondPlayer = Player(7)

        val isDeuce = firstPlayer.isDeuceWith(secondPlayer)

        assertTrue(isDeuce)
    }

}