package ws.codelogic.algorithms.sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {

    private Sort quickSort;
    private Integer[] unsorted = {9,8,7,4,3,2,6,5,1};
    private Integer[] sorted = {1,2,3,4,5,6,7,8,9};

    @Before
    public void setup() {
        quickSort = new QuickSort(unsorted);
    }

    @Test
    public void testSortedOrder() {
        quickSort.sort();
        assertEquals(unsorted, sorted);
    }

    //TODO need to test for duplicate keys
}
