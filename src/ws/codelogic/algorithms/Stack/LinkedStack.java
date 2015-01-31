package ws.codelogic.algorithms.Stack;

public class LinkedStack {

    private Node firstNode;

    public LinkedStack(){
        firstNode = new Node();
    }

    public void push(String item) {
        Node lastNode = firstNode;
        firstNode = new Node();
        firstNode.item = item;
        firstNode.next = lastNode;
    }

    public String pop() {
        firstNode = firstNode.next;
        return firstNode.item;
    }

    class Node{
        public String item;
        public Node next;
    }
}
