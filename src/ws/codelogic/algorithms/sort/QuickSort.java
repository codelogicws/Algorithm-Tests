package ws.codelogic.algorithms.sort;

import ws.codelogic.algorithms.shuffle.Shuffler;

public class QuickSort extends Sort{

    private Comparable temp;

    public QuickSort(Comparable[] array){
        this.array = array;
    }

    @Override
    public void sort() {
//        Shuffler shuffler = new Shuffler();
//        array = shuffler.shuffle(array);
        //DEBUG
        for(Comparable c : array){
            System.out.println(c + ", ");
        }
        //DEBUG
        recursiveSort(0, array.length-1);
    }

    private void recursiveSort(int low, int high){
        int mid = partitioning(low, high);
        if(low < mid-1){
            recursiveSort(low, mid-1);
        }
        if(mid+1 < high){
            recursiveSort(mid + 1, high);
        }
    }

    public int partitioning(int low, int high){
        int pivot = low;
        high++;

        while(low<=high) {
            while (less(array[++low], array[pivot])) ;
            while (less(array[pivot], array[--high])) ;
            swap(low, high);
        }
        swap(pivot, high);
        return high;
    }

    private void swap(int low, int high) {
        if(low<high){
            temp = array[low];
            array[low] = array[high];
            array[high] = temp;
        }
    }

    private boolean less(Comparable less, Comparable more){
        return less.compareTo(more) == -1;
    }

}
