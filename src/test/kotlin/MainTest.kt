import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `should increment the game score to 15`(){
        val player = Player(0)
        val expectedScore = 15

        val actualScore = incrementScore(player.score)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 30`(){
        val player = Player(15)
        val expectedScore = 30

        val actualScore = incrementScore(player.score)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 40`(){
        val player = Player(30)
        val expectedScore = 40

        val actualScore = incrementScore(player.score)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should win the game`(){
        val player = Player(40)
        val expectedScore = 1
        val actualScore = incrementScore(player.score)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should say deuce when players both have 40`(){
        val player1 = Player(40)
        val player2 = Player(40)

        val expectedScore = true
        val actualScore = compareScore(player1.score, player2.score)
        assertEquals(expectedScore, actualScore)
    }

}