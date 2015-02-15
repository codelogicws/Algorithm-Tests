package ws.codelogic.algorithms.priorityqueue;

public class BinaryTree <T>{

    private T[] elements;
    private int currentElement;

    public BinaryTree(T[] emptyArray){
        elements = emptyArray;
        currentElement = -1;
    }

    public void add(T element){
        elements[++currentElement] = element;
    }

    public T remove(){
        return elements[currentElement--];
    }


}
