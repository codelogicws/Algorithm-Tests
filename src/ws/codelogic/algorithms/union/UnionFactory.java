package ws.codelogic.algorithms.union;

public class UnionFactory {

    public static Union makeEager(int size){

        return new UnionEager(getOrderedArray(size));
    }

    public static Union makeQuickUnion(int size){
        return new QuickUnion(getOrderedArray(size));
    }

    private static Integer[] getOrderedArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

}
