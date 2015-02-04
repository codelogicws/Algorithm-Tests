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
            boolean unsortedSelectionIsSmallerThenCurrentLowest = lowest.isLowerThen(array[unsortedIndex]);
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


}
