package ws.codelogic.algorithms.sort;

public class QuickSort extends Sort{

    private Comparable temp;

    public QuickSort(Comparable[] array){
        this.array = array;
    }

    @Override
    public void sort() {
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
        System.out.println("Test");
        debugPrintArray();
    }

    public int partitioning(int low, int high){
        int pivot = low;
        high++;

        while(low<=high) {
            while (less(array[++low], array[pivot])) ;
            while (less(array[pivot], array[--high])) ;
            debug(low, high);
            swap(low, high);
            System.out.println("Swtich");
            debug(low, high);
        }
        swap(pivot, high);
        debugPrintArray();
        return high;
    }

    private void debugPrintArray() {
        for(Comparable c : array){
            printWithComma(c);
        }
    }

    private void debug(int low, int high){
        System.out.println("Debug-QuickSort low is: " + array[low] + " high is: " + array[high]);
    }

    private void printWithComma(Comparable c){
        System.out.print(c + ", ");
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
