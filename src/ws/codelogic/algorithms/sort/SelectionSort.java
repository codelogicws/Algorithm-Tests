package ws.codelogic.algorithms.sort;

public class SelectionSort{

    private final Comparable[] array;

    public SelectionSort(Comparable[] array){
        this.array = array;
    }


    public void sort() {
        for(int i=0;i<array.length;i++){
            Comparable lowestValue = array[i];
            int lowestIndex = i;
            for(int x=i+1;x<array.length;x++){
                if(array[x].compareTo(lowestValue) < 0){
                    lowestValue = array[x];
                    lowestIndex = x;
                }
            }
            swapMinDown(i, lowestIndex, lowestValue);
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
