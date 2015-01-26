package ws.codelogic.algorithms.union;


import ws.codelogic.array.ArrayFactory;

public class UnionFactory {

    public static Union makeEager(int size){

        return new UnionEager(ArrayFactory.getOrderedIntegerArray(size));
    }

    public static Union makeQuickUnion(int size){
        return new QuickUnion(ArrayFactory.getOrderedIntegerArray(size));
    }

    public static Union<Integer> makeQuickUnionPathCompression(int size){
        Integer[] branchPointer = ArrayFactory.getOrderedIntegerArray(size);
        return new QuickUnionPathCompression(branchPointer);
    }

    public static Union makeQuickUnionWeighted(int size){
        Integer[] branchPointer = ArrayFactory.getOrderedIntegerArray(size);
        Integer[] treeSize = ArrayFactory.getRepeatArray(size, 1);
        return new QuickUnionWeighted(branchPointer, treeSize);
    }

}
