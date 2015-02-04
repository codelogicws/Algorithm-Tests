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
            order();
        }
    }

    private void order() {
        orderPair();
    }

    private void orderPair() {
        if (outerIsSmallerThenInner()) {
            swap();
            if(inner>interval){
                decrementInnerAndOuterByInterval();
                orderPair();
            }
        }
    }

    private boolean outerIsSmallerThenInner(){
        return array[outer].compareTo(array[inner]) < 0;
    }

    private void decrementInnerAndOuterByInterval(){
        inner -= interval;
        outer -= interval;
    }

    private void swap() {
        temp = array[inner];
        array[inner] = array[outer];
        array[outer] = temp;
    }

}
