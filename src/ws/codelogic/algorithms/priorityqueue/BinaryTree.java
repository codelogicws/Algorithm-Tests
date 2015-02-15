package ws.codelogic.algorithms.priorityqueue;

public class BinaryTree{

    private Comparable[] elements;
    private int indexOfLastElement;

    public BinaryTree(Comparable[] emptyArray){
        elements = emptyArray;
        indexOfLastElement = -1;
    }

    public void add(Comparable element){
        elements[++indexOfLastElement] = element;
        swim(indexOfLastElement);
    }

    private void swim(int index) {
        if(parentIsLess(index)){
            //DEBUG
            System.out.println("debug-BinaryTree: need to swap " + index + " and " + parrentIndex(index));
            //DEBUG
//                swapWithParent(index);
//                swim(indexOfParent(index));
        }
    }

    private boolean parentIsLess(int index){
        if(hasParent(index)){
            int parrentIndex = parrentIndex(index);
            if(less(parrentIndex, index)){
                return true;
            }
        }
        return false;
    }

    private int parrentIndex(int index) {
        int treeIndex = index + 1;
        int parrentTreeIndex = treeIndex/2;
        return parrentTreeIndex -1;
    }


    private boolean less(int index1, int index2) {
        return (elements[index1].compareTo(elements[index2]) < 0);
    }

    private boolean hasParent(int index) {
        return index > 0;
    }

    private int indexOfParent(int currentIndex){
        return currentIndex/2;
    }

    public Comparable remove(){
        return elements[indexOfLastElement--];
    }


}
