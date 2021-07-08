import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `should increment the game score to 15`() {
        val player1 = Player(Score.LOVE)
        val player2 = Player(Score.LOVE)
        val expectedScore = 15
        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1.score.value, player2.score.value).first
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 30`() {
        val player1 = Player(Score.FIFTEEN)
        val player2 = Player(Score.FIFTEEN)
        val expectedScore = 30
        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1.score.value, player2.score.value).first
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 40`() {
        val player1 = Player(Score.THIRTY)
        val player2 = Player(Score.THIRTY)
        val expectedScore = 40

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1.score.value, player2.score.value).first
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should win the game`() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.LOVE)
        val expectedScore = 1

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1.score.value, player2.score.value).first
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return true when both players have 40`() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.FOURTY)

        val expectedScore = true
        val actualScore = compareScore(player1.score.value, player2.score.value)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return false when both players have different scores`() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.THIRTY)

        val expectedScore = false
        val actualScore = compareScore(player1.score.value, player2.score.value)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return false when both players have same scores that are not 40`() {
        val player1 = Player(Score.THIRTY)
        val player2 = Player(Score.THIRTY)

        val expectedScore = false
        val actualScore = compareScore(player1.score.value, player2.score.value)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return avantage if both players have 40 `() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.FOURTY)
        val expectedScore = 50

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1.score.value, player2.score.value).first

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return win the game if winning player had advantage`() {
        val player1 = Player(Score.AVANTAGE)
        val player2 = Player(Score.FOURTY)
        val expectedScore = 1

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1.score.value, player2.score.value).first

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return forty when win the ball and opponent had advantage`() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.AVANTAGE)
        val expectedScore = 40

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1.score.value, player2.score.value).first

        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return forty for opponent player when he-she had advantage`() {
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.AVANTAGE)
        val expectedScore = 40

        val match = Match(player1, player2)

        val actualScore = match.incrementScorePlayer1(player1.score.value, player2.score.value).second

        assertEquals(expectedScore, actualScore)
    }

}