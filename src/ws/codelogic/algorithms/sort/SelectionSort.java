package ws.codelogic.algorithms.sort;

public class SelectionSort extends Sort{

    private Element lowest;
    private final Comparable[] array;

    public SelectionSort(Comparable[] array){
        this.array = array;
    }


    public void sort() {
        for(int selected=0;selected<array.length;selected++){
            replaceWithSmallestUnsorted(selected);
        }
    }

    private void replaceWithSmallestUnsorted(int selected){
        findSmallest(selected);
        exchangeCurrentWithLowest(selected);
    }

    private void findSmallest(int selected){
        lowest = new Element(selected, array);
        for(int i=selected+1; i<array.length;i++){
            int unsortedIndex = i;
            boolean unsortedSelectionIsSmallerThenCurrentLowest = lowest.value.compareTo(array[unsortedIndex]) > 0;
            if(unsortedSelectionIsSmallerThenCurrentLowest){
                int newLowestIndex = unsortedIndex;
                lowest.set(newLowestIndex, array);
            }
        }
    }

    private void exchangeCurrentWithLowest(int selected) {
        array[lowest.index] = array[selected];
        array[selected] = lowest.value;
    }

    public Comparable[] getArray() {
        return array;
    }

    class Element{
        public Comparable value;
        public int index;

        public Element(int index, Comparable[] array){
            set(index, array);
        }

        public void set(int index, Comparable[] array){
            this.index = index;
            this.value = array[index];
        }
    }


}
