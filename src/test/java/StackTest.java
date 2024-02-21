import org.example.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {
    Stack pile;
    @BeforeEach
    void setUp(){
        pile = new Stack();

    }
    @Test
    void isEmptyTest(){
        assertEquals(true, pile.isEmpty());
        assertEquals("[]" ,pile.toString());
    }

    @Test
    void PeekTest(){
        assertThrows(IllegalStateException.class, pile::peek);

        pile.push(5);
        assertEquals(5 ,pile.peek());

    }
    @Test
    void PushTest(){
        pile.push(5);
        assertEquals(5,pile.peek());
        assertEquals(1,pile.size());
    }

    @Test
    void PopTest(){
        pile.push(5);
        pile.push(4);
        pile.pop();
        assertEquals(5,pile.peek());

        assertEquals(1,pile.size());
    }
    @Test
    void PopEmptyTest(){
        assertThrows(IllegalStateException.class, pile::pop);
        assertEquals(0,pile.size());
    }

    @Test
    void PushSouldExpendTheArrayIfStackIsFullTest(){
        for (int i = 0; i <10 ; i++) {
            pile.push(i);
        }

        assertEquals(10 ,pile.size());
        assertEquals(9 ,pile.peek());
        pile.push(10);
        assertEquals(11 ,pile.size());
        assertEquals(10 ,pile.peek());
        assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]" ,pile.toString());
    }



}
