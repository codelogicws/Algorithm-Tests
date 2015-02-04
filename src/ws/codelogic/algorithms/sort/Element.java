package ws.codelogic.algorithms.sort;

class Element {
    public Comparable value;
    public int index;

    public Element(int index, Comparable[] array){
        set(index, array);
    }

    public Element(Element toBeCopiedElement){
        index = toBeCopiedElement.index;
        value = toBeCopiedElement.value;
    }

    public void set(int index, Comparable[] array){
        this.index = index;
        this.value = array[index];
    }

    public boolean isLowerThen(Element comparable) {
        return value.compareTo(comparable.value) > 0;
    }

    public void set(Element toBeCopiedElement) {
        index = toBeCopiedElement.index;
        value = toBeCopiedElement.value;
    }
}
