package ws.codelogic.algorithms.Stack;

public class ArrayStack {

    private int size;
    private int capacity;
    private String[] elements;

    public ArrayStack(int capacity) {
        size = 0;
        this.capacity = capacity;
        elements = new String[capacity];
    }

    public void push(String item) {
        checkForOverFlow();
        elements[size] = item;
        size++;
    }

    private void checkForOverFlow(){
        if(size == capacity){
            throw new OverFlow();
        }
    }

    public int size() {
        return size;
    }

    public String pop() {
        checkForUnderFlow();
        size--;
        return elements[size];
    }

    private void checkForUnderFlow() {
        if(size == 0){
            throw new UnderFlow();
        }
    }

    public class OverFlow extends RuntimeException{
    }

    public class UnderFlow extends RuntimeException{
    }
}
