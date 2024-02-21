import org.example.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void testFactorialWithPositiveInput() {
        assertEquals(120, Factorial.factorial(5)); // 0! = 1
        assertEquals(1, Factorial.factorial(1)); // 1! = 1
    }

    @Test
    void testFactorialWithZero() {
        assertEquals(1, Factorial.factorial(0)); // 0! = 1
    }

    @Test
    void testFactorialWithNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-5));
    }

}