package ws.codelogic.algorithms.Stack;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkStackTest {

    LinkedStack stack;

    @Test
    public void testSinglePushAndPop(){
        stack = new LinkedStack();
        stack.push("Test");
        assertEquals("Test", stack.pop());
    }

}
