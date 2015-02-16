package ws.codelogic.algorithms.priorityqueue;

public class BinaryTree{

    private Comparable[] elements;
    private int indexOfLastElement;
    private Comparable temp;


    public BinaryTree(Comparable[] emptyArray){
        elements = emptyArray;
        indexOfLastElement = 0;
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
        return index/2;
    }


    private boolean less(int index1, int index2) {
        return (elements[index1].compareTo(elements[index2]) < 0);
    }

    private boolean hasParent(int index) {
        return index > 1;
    }

    public Comparable remove(){
        Comparable returnElement = elements[1];
        exchange(1, indexOfLastElement);
        elements[indexOfLastElement--] = 0;
        sink(1);
        return returnElement;
    }

    private void sink(int index){
        while(2*index <= indexOfLastElement){
            int child = 2*index;
            if(child <= indexOfLastElement && less(child, child + 1)){
                child++;
            }
            if(less(child, index)){
                break;
            }
            exchange(index, child);
            index = child;
        }
    }

    private int child1(int index){
        return (index+1)*2;
    }

}
