package ws.codelogic.algorithms.sort;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest extends SortTest{

    private InsertionSort sorter;

    @Before
    public void setUp() {
        sorter = new InsertionSort(unsorted);
    }

    @Test
    public void correctOrderIsReturned() {
        correctOrderIsReturned(sorter);
    }
}
