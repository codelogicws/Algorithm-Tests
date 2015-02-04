package ws.codelogic.algorithms.sort;

import java.util.ArrayList;

public class ShellSort extends Sort{

    private int inner, outer;
    private Comparable temp;
    private ArrayList<Integer> intervals;
    private int interval;

    public ShellSort(Comparable[] array){
        this.array = array;
        createIntervalArray();
    }

    private void createIntervalArray() {
        intervals = new ArrayList<Integer>();
        int tempInterval = 1;
        intervals.add(tempInterval);
        while((tempInterval = tempInterval*3+1) < array.length){
            intervals.add(tempInterval);
        }
    }

    public void sort() {
        for(int i=intervals.size()-1;i>=0;i--){
            interval = intervals.get(i);
            intervalSort();
        }
    }

    private void intervalSort() {
        for(inner=0; inner+interval<array.length; inner++){
            outer = inner+interval;
            order(inner, outer);
        }
    }

    private void order(int inner, int outer) {
        orderPair(inner, outer);
    }

    private void orderPair(int inner, int outer) {
        boolean outerIsSmallerThenInner = array[outer].compareTo(array[inner]) < 0;
        if (outerIsSmallerThenInner) {
            swap(inner, outer);
            if(inner>interval){
                inner -= interval;
                outer -= interval;
                orderPair(inner, outer);
            }
        }
    }

    private void swap(int inner, int outer) {
        System.out.println("debug-ShellSort: ");
        temp = array[inner];
        array[inner] = array[outer];
        array[outer] = temp;
    }

    private void printArrayList(ArrayList<Integer> intervals) {
        for(Integer numb : intervals){
            System.out.println("debug-ShellSort: " + numb);
        }
    }

}
