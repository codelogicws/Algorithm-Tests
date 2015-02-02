package ws.codelogic.algorithms.sort;

public class InsertionSort {

    private final Comparable[] array;

    public InsertionSort(Comparable[] array){
        this.array = array;
    }

    public void sort() {
        for(int i=0;i<array.length;i++){
            int currentIndex = i;
            for(int x=i-1;x>=0;x--){
                if(array[currentIndex].compareTo(array[x]) < 0){
                    Comparable temp = array[currentIndex];
                    array[currentIndex] = array[x];
                    array[x] = temp;
                    currentIndex = x;
                }
            }
        }
    }

    public Comparable[] getArray() {
        return array;
    }
}
