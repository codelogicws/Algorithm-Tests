package ws.codelogic.algorithms.union;

public class UnionFactory {

    public static Union makeEager(int size){

        return new UnionEager(getOrderedArray(size));
    }

    public static Union makeQuickUnion(int size){
        return new QuickUnion(getOrderedArray(size));
    }

    public static Union makeQuickUnionWeighted(int size){
        Integer[] branchPointer = getOrderedArray(size);
        Integer[] treeSize = getRepeatArray(size, 1);
        return new QuickUnionWeighted(branchPointer, treeSize);
    }

    private static Integer[] getOrderedArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    private static Integer[] getRepeatArray(int size, int fillArrayWith){
        Integer[] array = new Integer[size];
        for(int i=0;i<size;i++){
            array[i] = fillArrayWith;
        }
        return array;
    }

}
