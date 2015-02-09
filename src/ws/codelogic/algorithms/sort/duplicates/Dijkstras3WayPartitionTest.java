package ws.codelogic.algorithms.sort.duplicates;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Dijkstras3WayPartitionTest {

    private Dijkstras3WayPartition sort;

    @Before
    public void setup() {
        sort = new Dijkstras3WayPartition();
    }

    @Test
    public void testEasyDuplicateSort() {
        Integer[] unsorted = {8,7,9,7,8,7,9,8,8,9,7,9};
        Integer[] sorted = {7,7,7,7,8,8,8,8,9,9,9,9};
        testArray(unsorted, sorted);
    }

    @Test
    public void testMoreThen3TypeSort() {
        Integer[] unsorted = {3,2,1,5,5,3,1,2,4,2,4,3,5,1,4};
        Integer[] sorted = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5};
        testArray(unsorted, sorted);
    }

    @Test
    public void testEdgeCase1() {
        Integer[] unsorted = {1,5,4,4,1,5};
        Integer[] sorted = {1,1,4,4,5,5};
        testArray(unsorted, sorted);
    }

    @Test
    public void testEdgeCase2() {
        Integer[] unsorted = {5,1,4,5,4,1};
        Integer[] sorted = {1,1,4,4,5,5};
        testArray(unsorted, sorted);
    }

    private void testArray(Comparable[] unsorted, Comparable[] sorted){
        sort.sort(unsorted);
        Comparable[] newlySorted = unsorted;
        assertEquals(newlySorted, sorted);
    }
}
