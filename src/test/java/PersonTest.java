import org.example.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void testGetFullName() {
        // Equivalence class: Valid input
        Person person = new Person("John", "Doe", 25);
        assertEquals("John Doe", person.getFullName());
    }

    @Test
    void testIsNotAdult() {
        Person person = new Person("Alice", "Johnson", 15);
        assertFalse(person.isAdult());
    }

    @Test
    void testIsAdult() {
        Person person = new Person("Bob", "Smith", 18);
        assertTrue(person.isAdult());
    }

}