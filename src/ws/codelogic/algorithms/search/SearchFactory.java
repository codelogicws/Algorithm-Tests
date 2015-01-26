package ws.codelogic.algorithms.search;

import ws.codelogic.array.ArrayFactory;

public class SearchFactory {
    public static Search makeBinary(int size){
        int[] array = ArrayFactory.getOrderedArray(size);
        return new BinarySearch(array);
    }
}
