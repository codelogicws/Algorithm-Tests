package ws.codelogic.algorithms.sort;

import org.junit.Before;
import org.junit.Test;

public class ShellSortTest extends SortTest{

    private Sort sorter;

    @Before
    public void setUp() {
        sorter = new ShellSort(unsorted);
    }

    @Test
    public void correctOrderIsReturnedWithCharaters() {
        sorter = new ShellSort(unsorted2);
        orderCharatersInTheCorrectWay(sorter);
    }

    @Test
    public void correctOrderIsReturnedWithIntegers() {
        correctOrderIsReturned(sorter);
    }
}
