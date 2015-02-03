package ws.codelogic.algorithms.sort;

public abstract class Sort {

    protected Comparable[] array;

    abstract public void sort();

    public Comparable[] getArray() {
        return array;
    }
}
