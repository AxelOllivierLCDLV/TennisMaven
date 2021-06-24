import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `should increment the game score to 15`(){
        val oldScore = 0
        val expectedScore = 15

        val actualScore = incrementScore(oldScore)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 30`(){
        val oldScore = 15
        val expectedScore = 30

        val actualScore = incrementScore(oldScore)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should increment the game score to 40`(){
        val oldScore = 30
        val expectedScore = 40

        val actualScore = incrementScore(oldScore)
        assertEquals(expectedScore, actualScore)
    }

    @Test
    fun `should win the game`(){
        val oldScore = 40
        val expectedScore = 1
        val actualScore = player1.incrementScore(oldScore)
        assertEquals(player1.win, true)
    }
}