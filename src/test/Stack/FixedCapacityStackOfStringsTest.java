package test.Stack; 

import Stack.FixedCapacityStackOfStrings;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

public class FixedCapacityStackOfStringsTest {

    FixedCapacityStackOfStrings stack;

    @Before
    public void before() throws Exception {
        stack = new FixedCapacityStackOfStrings(4);
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: push(String s)
    *
    */
    @Test
    public void testPush() throws Exception {
    //TODO: Test goes here...
    }

    @Test
    public void testIsFull_Full(){
        for(int i=0;i<stack.length();i++){
            stack.push("test");
        }
        assertTrue(stack.isFull());
    }

    public void testIsFull_NotFull(){
        for(int i=0;i<stack.length()-1;i++){
            stack.push("test");
            assertFalse(stack.isFull());
        }
    }

    @Test
    public void testPop() throws Exception {
    //TODO: Test goes here...
} 


} 
