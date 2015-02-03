package ws.codelogic.algorithms.sort;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest extends SortTest{

    private SelectionSort sorter;

    @Before
    public void setUp() {
        sorter = new SelectionSort(unsorted);
    }

    @Test
    public void correctOrderIsReturned() {
        correctOrderIsReturned(sorter);
    }
}
