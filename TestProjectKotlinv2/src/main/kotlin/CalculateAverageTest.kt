import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculateAverageTest {



    @Test
    fun testOneArray() {
        val numbers = intArrayOf(1)
        assertEquals(1.0, calculateAverage(numbers))
    }
    @Test
    fun testEmpty() {
        val numbers = intArrayOf()
        assertEquals(0.0, calculateAverage(numbers))
    }

    @Test
    fun testMultipleArray() {
        val numbers = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(3.0, calculateAverage(numbers))
    }

    @Test
    fun testMultipleArrayBigNumbers() {
        val numbers = intArrayOf(10000012, 121232, 4242253, 4353536, 51297767)
        assertEquals(3.0, calculateAverage(numbers))
    }
}
