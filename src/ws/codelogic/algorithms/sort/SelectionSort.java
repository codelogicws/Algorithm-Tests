package ws.codelogic.algorithms.sort;

public class SelectionSort{

    private final Comparable[] array;

    public SelectionSort(Comparable[] array){
        this.array = array;
    }


    public void sort() {
        for(int i=0;i<array.length;i++){
            Comparable lowestValue = array[i];
            FindAndSwitchWithLowerValues(i, lowestValue);
        }
    }

    private void FindAndSwitchWithLowerValues(int i, Comparable lowestValue) {
        for(int x=i+1;x<array.length;x++){
            if(array[x].compareTo(lowestValue) < 0){
                swapMinDown(i, x, array[x]);
            }
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
