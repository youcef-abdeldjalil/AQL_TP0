import org.example.Prime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    void testIsPrimeWithPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
    }
    @Test
    void testIsPrimeWithNonPrimeNumbers() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
    }

    @Test
    void testIsPrimeWithNegativeNumbers() {
        assertFalse(Prime.isPrime(-2));
        assertFalse(Prime.isPrime(-7));
    }


}