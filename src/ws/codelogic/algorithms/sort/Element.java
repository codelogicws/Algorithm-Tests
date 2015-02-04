package ws.codelogic.algorithms.sort;

class Element {
    public Comparable value;
    public int index;

    public Element(int index, Comparable[] array){
        set(index, array);
    }

    public void set(int index, Comparable[] array){
        this.index = index;
        this.value = array[index];
    }

    public boolean isLowerThen(Comparable comparable) {
        return value.compareTo(comparable) > 0;
    }
}
