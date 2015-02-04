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
        printArrayList(intervals);
    }

    private void printArrayList(ArrayList<Integer> intervals) {
        for(Integer numb : intervals){
            System.out.println("debug-ShellSort: " + numb);
        }
    }

}
