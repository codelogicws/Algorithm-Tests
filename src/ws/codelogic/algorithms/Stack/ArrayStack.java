package ws.codelogic.algorithms.Stack;

public class ArrayStack implements Stack {

    private int size;
    private int capacity;
    private String[] elements;

    public static Stack make(int capacity){
        checkForCapacityOutOfBounds(capacity);
        Stack stack;
        if(capacity == 0)
            return stack = new ArrayStackZero();
        return new ArrayStack(capacity);
    }

    private static void checkForCapacityOutOfBounds(int capacity) {
        if(capacity < 0){
            throw new CapacityOutOfBounds();
        }
    }

    private ArrayStack(int capacity) {
        size = 0;
        this.capacity = capacity;
        elements = new String[capacity];
    }

    @Override
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

    @Override
    public int size() {
        return size;
    }

    @Override
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

}
