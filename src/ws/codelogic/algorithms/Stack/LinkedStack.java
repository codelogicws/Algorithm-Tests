package ws.codelogic.algorithms.Stack;

public class LinkedStack {

    private Node firstNode;
    private int size;

    public LinkedStack(){
        firstNode = new Node();
        size = 0;
    }

    public void push(String item) {
        Node lastNode = firstNode;
        firstNode = new Node();
        firstNode.item = item;
        firstNode.next = lastNode;
        size++;
    }

    public String pop() {
        String returnItem = "";
        if(isEmpty()){
            throw new StackUnderFlow();
        }else{
            returnItem = performPop();
        }
        return returnItem;
    }

    private String performPop(){
        size--;
        Node lastNode = firstNode;
        firstNode = firstNode.next;
        return lastNode.item;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    class Node{
        public String item;
        public Node next;
    }

    class StackUnderFlow extends RuntimeException{
        StackUnderFlow(){
            super("Stack had a pull called when there are no elements left in the stack");
        }
    }
}
