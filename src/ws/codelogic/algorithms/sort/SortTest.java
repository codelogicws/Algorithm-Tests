package ws.codelogic.algorithms.sort;

import static org.junit.Assert.*;

public class SortTest {

    protected Integer[] unsorted = new Integer[]{4,5,3,2,1};
    protected Integer[] sorted = new Integer[]{1,2,3,4,5};

    protected Character[] unsorted2 = new Character[]{'b', 'd', 'x', 'e', 'u', 'f', 'n', 'g', 'h', 'i', 'j', 'y', 'k', 'l', 'm', 'o', 'p', 'a', 'q', 'r', 's', 't', 'v', 'c', 'w', 'z'};
    protected Character[] sorted2 = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public void correctOrderIsReturned(Sort sorter) {
        sorter.sort();
        Integer[] result = (Integer[])sorter.getArray();
        assertEquals(sorted, result);
    }

    public void orderCharatersInTheCorrectWay(Sort sorter){
        printArray(unsorted2);
        sorter.sort();
        printArray((Character[])sorter.getArray());
        Character[] result = (Character[])sorter.getArray();
        assertEquals(sorted2, result);
    }

    private void printArray(Character[] array) {
        for(Character c : array){
            System.out.print(c + ", ");
        }
        System.out.println("---------");
    }
}
