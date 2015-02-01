package ws.codelogic.algorithms.Stack;

public class ArrayStackZero implements Stack{

    @Override
    public void push(String item) {
        throw new OverFlow();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String pop() {
        throw new UnderFlow();
    }
}

