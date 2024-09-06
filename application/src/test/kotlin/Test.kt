import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class Test {

    @Test
    fun test() {
        assertTrue { true }
    }

    @Test
    fun test2() {
        assertFalse { false }
    }
}