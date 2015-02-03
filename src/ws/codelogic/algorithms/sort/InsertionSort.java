package ws.codelogic.algorithms.sort;

public class InsertionSort extends Sort{

    private final Comparable[] array;
    private int currentIndex;

    public InsertionSort(Comparable[] array){
        this.array = array;
    }

    public void sort() {
        for(int i=0;i<array.length;i++){
            currentIndex = i;
            sortIOnLeftSideOfArray(i);
        }
    }

    private void sortIOnLeftSideOfArray(int i) {
        for(int x=i-1;x>=0;x--){
            boolean outOfOrder = array[currentIndex].compareTo(array[x]) < 0;
            if(outOfOrder){
                swapValues(x);
            }
        }
    }

    private void swapValues(int x) {
        Comparable temp = array[currentIndex];
        array[currentIndex] = array[x];
        array[x] = temp;
        currentIndex = x;
    }

    public Comparable[] getArray() {
        return array;
    }
}
