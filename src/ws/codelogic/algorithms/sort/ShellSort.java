package ws.codelogic.algorithms.sort;

import java.util.ArrayList;

public class ShellSort extends Sort{

    private int inner, outer, temp;
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
            System.out.println("debug-ShellSort: inner " + inner);
            printArrayList(intervals);
        }
    }

    private void printArrayList(ArrayList<Integer> intervals) {
        for(Integer numb : intervals){
            System.out.println("debug-ShellSort: " + numb);
        }
    }

}
