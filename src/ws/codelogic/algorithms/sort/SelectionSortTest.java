package ws.codelogic.algorithms.sort;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest extends SortTest{

    private Sort sorter;

    @Before
    public void setUp() {
        sorter = new SelectionSort(unsorted);
    }

    @Test
    public void correctOrderIsReturned() {
        correctOrderIsReturned(sorter);
    }

//    @Test
//    public void correctOrderWithCharaters() {
//        sorter = new SelectionSort(unsorted2);
//        orderCharatersInTheCorrectWay(sorter);
//    }
}
