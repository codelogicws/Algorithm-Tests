package ws.codelogic.algorithms.priorityqueue;

public class BinaryTree{

    private Comparable[] elements;
    private int indexOfLastElement;
    private Comparable temp;
    private int child1;
    private int child2;


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
            swapWithParent(index);
            swim(parrentIndex(index));
        }
    }

    private void swapWithParent(int index){
        int parentIndex = parrentIndex(index);
        exchange(index, parentIndex);
    }

    private void exchange(int index, int parentIndex) {
        temp = elements[index];
        elements[index] = elements[parentIndex];
        elements[parentIndex] = temp;
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
        return parrentTreeIndex - 1;
    }


    private boolean less(int index1, int index2) {
        return (elements[index1].compareTo(elements[index2]) < 0);
    }

    private boolean hasParent(int index) {
        return index > 0;
    }

    public Comparable remove(){
        exchange(0, indexOfLastElement);
        sink(0);
        elements[indexOfLastElement] = 0;
        return elements[indexOfLastElement--];
    }

    private void sink(int index){
        //DEBUG
        System.out.println("debug-BinaryTree: ");
        for(Comparable c : elements){
            System.out.println(c);
        }
        System.out.println("--------------");
        System.out.println(index + " " + child1(index));
        //DEBUG

        child1 = child1(index);
        child2 = child2(index);

        //TODO here is where you work a object down. need to make sure you move the object down to the largest of the 2 leaves
    }

    private int child1(int index){
        return (index+1)*2;
    }

    private int child2(int index){
        return child1(index)-1;
    }


}
