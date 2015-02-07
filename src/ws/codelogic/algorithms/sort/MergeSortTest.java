package ws.codelogic.algorithms.sort;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

    private MergeSort sort;

    @Before
    public void setup() {
        sort = new MergeSort();
    }

    @Test
    public void testMergeOrder() {
        Integer[] nonSorted = {2,4,5,1,3,6};
        Integer[] aux = new Integer[nonSorted.length];
        sort.merger(nonSorted, aux, 0, 2, 5);

        System.out.println("Debug-MergeSortTest merge list");
        for(int i=0;i<nonSorted.length;i++){
            System.out.print(nonSorted[i] + " ");
        }
        System.out.println();
        System.out.println("Debug-MergeSortTest -----");
    }
}
