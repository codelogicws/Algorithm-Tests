package ws.codelogic.algorithms.sort;

public class SelectionSort extends Sort{

    private Element lowest;
    private Element stage;
    private Element suiter;
    private final Comparable[] array;

    public SelectionSort(Comparable[] array){
        this.array = array;
    }


    public void sort() {
        for(int selected=0;selected<array.length;selected++){
            suiter = new Element(selected, array);
            replaceWithSmallestUnsorted();
        }
    }

    private void replaceWithSmallestUnsorted(){
        findSmallest();
        exchangeCurrentWithLowest(suiter.index);
    }

    private void findSmallest(){
        lowest = new Element(suiter);
        int unsortedStartIndex = suiter.index + 1;
        for(int i=unsortedStartIndex; i<array.length;i++){
            int unsortedIndex = i;
            handleSmallerValues(unsortedIndex);
        }
    }

    private void handleSmallerValues(int unsortedIndex) {
        boolean unsortedSelectionIsSmallerThenCurrentLowest = lowest.isLowerThen(array[unsortedIndex]);
        if(unsortedSelectionIsSmallerThenCurrentLowest){
            int newLowestIndex = unsortedIndex;
            lowest.set(newLowestIndex, array);
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
