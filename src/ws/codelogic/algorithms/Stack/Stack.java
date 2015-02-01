package ws.codelogic.algorithms.Stack;

public interface Stack {
    void push(String item);

    int size();

    String pop();

    public static class OverFlow extends RuntimeException{
    }

    public static class UnderFlow extends RuntimeException{
    }

    public static class CapacityOutOfBounds extends RuntimeException{
    }
}
