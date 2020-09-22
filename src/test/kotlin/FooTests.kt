import org.junit.jupiter.api.Test

class FooTests {

    @Test
    fun fooTest() {
        val result = Foo().bar()
        assert(result == true)
    }
}