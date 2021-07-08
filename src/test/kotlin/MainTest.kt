import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `should increment the game score to 15`(){
        val player = Player(Score.LOVE)
        val expectedScore = 15

        val actualScore = incrementScore(player.score.value)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 30`(){
        val player = Player(Score.FIFTEEN)
        val expectedScore = 30

        val actualScore = incrementScore(player.score.value)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 40`(){
        val player = Player(Score.THIRTY)
        val expectedScore = 40

        val actualScore = incrementScore(player.score.value)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should win the game`(){
        val player = Player(Score.FOURTY)
        val expectedScore = 1
        val actualScore = incrementScore(player.score.value)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return true when both players have 40`(){
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.FOURTY)

        val expectedScore = true
        val actualScore = compareScore(player1.score.value, player2.score.value)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return false when both players have diferent scores`(){
        val player1 = Player(Score.FOURTY)
        val player2 = Player(Score.THIRTY)

        val expectedScore = false
        val actualScore = compareScore(player1.score.value, player2.score.value)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should return false when both players have same scores that are not 40`(){
        val player1 = Player(Score.THIRTY)
        val player2 = Player(Score.THIRTY)

        val expectedScore = false
        val actualScore = compareScore(player1.score.value, player2.score.value)
        assertEquals(expectedScore, actualScore)
    }

}