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
        sort.merger(nonSorted, aux, 0, 2, 5);
        assertEquals(nonSorted, sorted);
    }
}
