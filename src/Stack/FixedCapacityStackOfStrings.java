package Stack;

public class FixedCapacityStackOfStrings {

    private int capacity;
    private int numberOfElements;

    public FixedCapacityStackOfStrings(int capacity){
        this.capacity = capacity;
        numberOfElements = 0;
    }

    public void push(String s){
        numberOfElements++;
    }

    public boolean isFull(){
        return numberOfElements == capacity;
    }

    public int length(){
        return capacity;
    }

    public String pop(){
        numberOfElements--;
        return "error in stack";
    }
}
