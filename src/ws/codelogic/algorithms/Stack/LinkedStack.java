package ws.codelogic.algorithms.Stack;

public class LinkedStack {

    private Node firstNode;
    private int size;

    public LinkedStack(){
        firstNode = new Node();
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
        if(size <= 0){
            System.out.println("This gets called");
            throw new StackUnderFlow();
        }else{
            returnItem = performPop();
        }
        return returnItem;
    }

    private String performPop(){
        size--;
        firstNode = firstNode.next;
        return firstNode.item;
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
