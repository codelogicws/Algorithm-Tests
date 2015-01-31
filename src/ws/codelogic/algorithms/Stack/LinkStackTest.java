package ws.codelogic.algorithms.Stack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkStackTest {

    LinkedStack stack;

    @Before
    public void setUp(){
        stack = new LinkedStack();
    }

    @Test
    public void testSinglePushAndPop(){
        stack.push("Test");
        assertEquals("Test", stack.pop());
    }

    @Test(expected = LinkedStack.StackUnderFlow.class)
    public void testOverPop() {
        stack.pop();
    }
}
