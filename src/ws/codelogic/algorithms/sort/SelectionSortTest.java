package ws.codelogic.algorithms.sort;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

    private Integer[] unsorted = new Integer[]{4,5,3,2,1};
    private Integer[] sorted = new Integer[]{1,2,3,4,5};
    private SelectionSort sorter;

    @Before
    public void setUp() {
        sorter = new SelectionSort(unsorted);
    }

    @Test
    public void correctOrderIsReturned() {
        sorter.sort();
        Integer[] result = (Integer[])sorter.getArray();
        assertEquals(sorted, result);
    }
}
