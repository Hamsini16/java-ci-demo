
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", EvenOdd.check(4));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", EvenOdd.check(7));
    }

    @Test
    void testZero() {
        assertEquals("Even", EvenOdd.check(0));
    }
}
