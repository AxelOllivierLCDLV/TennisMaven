import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `should increment the game score to 15`() {
        val player1 = Player(Score.LOVE)
        val player2 = Player(Score.LOVE)
        val expectedScore = Score.FIFTEEN
        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1, player2).first
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 30`() {
        val player1 = Player(Score.FIFTEEN)
        val player2 = Player(Score.FIFTEEN)
        val expectedScore = Score.THIRTY
        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1, player2).first
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 40`() {
        val player1 = Player(Score.THIRTY)
        val player2 = Player(Score.THIRTY)
        val expectedScore = Score.FOURTY

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1, player2).first
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should win the game`() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.LOVE)
        val expectedScore = Score.WON

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1, player2).first
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return avantage if both players have 40 `() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.FOURTY)
        val expectedScore = Score.ADVANTAGE

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1, player2).first

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return win the game if winning player had advantage`() {
        val player1 = Player(Score.ADVANTAGE)
        val player2 = Player(Score.FOURTY)
        val expectedScore = Score.WON

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1, player2).first

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return forty when win the ball and opponent had advantage`() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.ADVANTAGE)
        val expectedScore = Score.FOURTY

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1, player2).first

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return forty for opponent player when he-she had advantage`() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.ADVANTAGE)
        val expectedScore = Score.FOURTY

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1, player2).second

        assertEquals(expectedScore, actualScore)
    }

}