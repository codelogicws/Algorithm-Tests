package ws.codelogic.algorithms.sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {

    private QuickSort quickSort;

    @Before
    public void setup() {
        quickSort = new QuickSort();
    }

    @Test
    public void testSortedOrder() {
        Integer[] unsorted = {9,8,4,3,6,7,2,1,5};
        Integer[] sorted = {1,2,3,4,5,6,7,8,9};
        test(unsorted, sorted);
    }

    @Test
    public void testSortingWithDuplicates() {
        Integer[] unsorted = {9,8,4,3,6,7,2,1,5,4,6,7};
        Integer[] sorted = {1,2,3,4,4,5,6,6,7,7,8,9};
        test(unsorted, sorted);
    }

    @Test
    public void testSortingEdgeCase1() {
        Integer[] unsorted = {1,6,5,4,8,9};
        Integer[] sorted = {1,4,5,6,8,9};
        test(unsorted, sorted);
    }

    private void test(Integer[] unsorted, Integer[] sorted){
        quickSort.sort(unsorted);
        Integer[] newlySorted = unsorted;
        assertEquals(newlySorted, sorted);
    }

    //TODO need to test for duplicate keys
}