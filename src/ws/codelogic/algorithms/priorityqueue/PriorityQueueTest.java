package ws.codelogic.algorithms.priorityqueue;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    private BinaryTree<Integer> queue;

    @Before
    public void setUp() {
        Integer[] array = new Integer[5];
        queue = new BinaryTree<Integer>(array);
    }

    @Test
    public void adding1ObjectYeildsThatObject() {
        queue.add(9);
        checkNumber(9);
    }

    private void checkNumber(Integer numberToTest){
        Integer numberFromQueue = queue.remove();
        assertEquals(numberFromQueue, numberToTest);
    }

    @Test
    public void adding3ObjectYeildsThoseObjectsInOrder() {
        queue.add(5);
        queue.add(1);
        queue.add(9);
        checkNumber(9);
        checkNumber(5);
        checkNumber(1);
    }

}
