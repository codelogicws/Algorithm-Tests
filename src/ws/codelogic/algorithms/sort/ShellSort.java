package ws.codelogic.algorithms.sort;

import java.util.ArrayList;

public class ShellSort extends Sort{

    private int currentIndex;
    private int inner, outer, temp;
    private ArrayList<Integer> intervals;

    public ShellSort(Comparable[] array){
        this.array = array;
        computeIntervals(array);
    }

    private void computeIntervals(Comparable[] array) {
        intervals = new ArrayList<Integer>();
        int newInterval = 1;
        while(newInterval <= array.length){
            intervals.add(newInterval);
            newInterval = newInterval * 3 + 1;
        }
    }

    public void sort() {
        for(Integer interval : intervals){
            sort(interval);
        }
    }

    private void sort(int interval){
        for(int i=0; i+interval<array.length; i++){
            inner = i;
            outer = i+interval;
//            swapDown(inner, outer);
        }
    }

    private void printArrayList(ArrayList<Integer> intervals) {
        for(Integer numb : intervals){
            System.out.println("debug-ShellSort: " + numb);
        }
    }

}
