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
}