package ws.codelogic.algorithms.sort;

import static org.junit.Assert.*;

public class SortTest {

    protected Integer[] unsorted = new Integer[]{4,5,3,2,1};
    protected Integer[] sorted = new Integer[]{1,2,3,4,5};

    public void correctOrderIsReturned(Sort sorter) {
        sorter.sort();
        Integer[] result = (Integer[])sorter.getArray();
        assertEquals(sorted, result);
    }
}
