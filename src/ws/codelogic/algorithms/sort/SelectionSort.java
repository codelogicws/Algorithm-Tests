package ws.codelogic.algorithms.sort;

public class SelectionSort extends Sort{

    private final Comparable[] array;

    public SelectionSort(Comparable[] array){
        this.array = array;
    }


    public void sort() {
        for(int selected=0;selected<array.length;selected++){
            replaceWithSmallestUnsorted(selected);
        }
    }

    private void replaceWithSmallestUnsorted(int selected) {
        Comparable lowestValue = array[selected];
        for(int unsortedSelect=selected+1;   unsortedSelect<array.length;   unsortedSelect++){
            sortIndex(selected, lowestValue, unsortedSelect);
        }
    }

    private void sortIndex(int i, Comparable lowestValue, int x) {
        boolean xIsLessThenLowestValue = array[x].compareTo(lowestValue) < 0;
        if(xIsLessThenLowestValue){
            swapMinDown(i, x, array[x]);
        }
    }

    private void swapMinDown(int leftIndex, int rightIndex, Comparable min) {
        array[rightIndex] = array[leftIndex];
        array[leftIndex] = min;
    }

    public Comparable[] getArray() {
        return array;
    }


}
