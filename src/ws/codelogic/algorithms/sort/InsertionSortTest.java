package ws.codelogic.algorithms.sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {

    private Integer[] unsorted = new Integer[]{4,5,3,2,1};
    private Integer[] sorted = new Integer[]{1,2,3,4,5};
    private InsertionSort sorter;

    @Before
    public void setUp() {
        sorter = new InsertionSort(unsorted);
    }

    @Test
    public void correctOrderIsReturned() {
        sorter.sort();
        Integer[] result = (Integer[])sorter.getArray();
        assertEquals(sorted, result);
    }
}
