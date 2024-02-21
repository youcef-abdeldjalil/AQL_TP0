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
        pile.pop();
        assertThrows(IllegalStateException.class, pile::peek);
        assertEquals(0,pile.size());
    }
    @Test
    void PushSouldExpendTheArrayIfStackIsFullTest(){
        for (int i = 0; i <9 ; i++) {
            pile.push(i);
        }
        assertEquals(9,pile.size());
        pile.push(10);
        assertEquals(10 ,pile.size());
        assertEquals(10 ,pile.peek());
    }



}
