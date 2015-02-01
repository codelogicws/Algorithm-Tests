package ws.codelogic.algorithms.Stack;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ArrayStackTest {

    private Stack stack;

    @Before
    public void setUp() {
        stack = ArrayStack.make(3);
    }

    @Test
    public void testPushIncreasesSize() {
        stack.push("Fire");
        assertEquals(stack.size(), 1);
    }

    @Test
    public void popShoudDecrementSize() {
        stack.push("Fire");
        stack.pop();
        assertEquals(stack.size(), 0);
    }

    @Test(expected = ArrayStack.OverFlow.class)
    public void pushPassedCapacityThrowsOverFlowException() {
        stack.push("");
        stack.push("");
        stack.push("");
        stack.push("");
    }

    @Test(expected = ArrayStack.UnderFlow.class)
    public void popWhenAt0CapacityThrowsUnderFlowException() {
        stack.pop();
    }

    @Test
    public void whenStringIsPushed_ItIsPoped() {
        stack.push("fire");
        stack.push("poi");
        assertEquals("poi", stack.pop());
    }

    @Test
    public void whenPopedItemIsRemovedExposingThePreviousItem() {
        stack.push("fire");
        stack.push("poi");
        stack.pop();
        assertEquals("fire", stack.pop());
    }

    @Test(expected = ArrayStack.CapacityOutOfBounds.class)
    public void WhenAttemptToCreateStackWithNegativeSizeThrowException() {
        Stack stack = ArrayStack.make(-1);
    }

    @Test(expected = ArrayStack.OverFlow.class)
    public void WhenMakingA0CapacityStack_PushShouldOverFlow() {
        stack = ArrayStack.make(0);
        assertTrue(stack instanceof ArrayStackZero);
        stack.push("Poi");
    }



}

