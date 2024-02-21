import org.example.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    @Test
    void testFibonacciWithZero() {
        // Equivalence class: n = 0
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void testFibonacciWithOne() {
        // Equivalence class: n = 1
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void testFibonacciWithTwoOrMore() {
        // Equivalence class: n >= 2
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        // Add more test cases based on your understanding of Fibonacci sequence
    }

    @Test
    void testFibonacciWithNegativeInput() {
        // Equivalence class: Negative input
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-5));
        // Add more test cases for negative inputs
    }
}
