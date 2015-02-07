package ws.codelogic.algorithms.sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {

    private MergeSort sort;

    @Before
    public void setup() {
        sort = new MergeSort();
    }

    @Test
    public void testMergeOrder() {
        Integer[] nonSorted = {2,4,5,1,3,6};
        Integer[] sorted = {1,2,3,4,5,6};
        Integer[] aux = new Integer[nonSorted.length];
        sort.merge(nonSorted, aux, 0, 2, 5);
        assertEquals(nonSorted, sorted);
    }

    @Test
    public void testMergeSortOrder() {
        Integer[] nonSorted = {9,7,5,6,4,8,1,3,2};
        Integer[] sorted = {1,2,3,4,5,6,7,8,9};
        Integer[] aux = new Integer[nonSorted.length];
        sort.sort(nonSorted, aux, 0, nonSorted.length-1);
        assertEquals(nonSorted, sorted);
    }
}
