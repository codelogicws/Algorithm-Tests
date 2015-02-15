package ws.codelogic.algorithms.priorityqueue;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    private BinaryTree queue;

    @Before
    public void setUp() {
        Integer[] array = new Integer[10];
        queue = new BinaryTree(array);
    }

    @Test
    public void adding1ObjectYeildsThatObject() {
        queue.add(20);
        checkNumber(20);
    }

    private void checkNumber(Integer numberToTest){
        Integer numberFromQueue = (Integer)queue.remove();
        assertEquals(numberToTest, numberFromQueue);
    }

    @Test
    public void adding9ObjectYeildsThoseObjectsInOrder() {
        queue.add(5);
        queue.add(7);
        queue.add(9);
        queue.add(12);
        queue.add(24);
        queue.add(101);
        queue.add(58);
        queue.add(8);
        queue.add(450);
        checkNumber(450);
        checkNumber(101);
        checkNumber(58);
        checkNumber(24);
        checkNumber(12);
        checkNumber(9);
        checkNumber(8);
        checkNumber(7);
        checkNumber(5);
    }



    //array is full
    //array is empty

}
