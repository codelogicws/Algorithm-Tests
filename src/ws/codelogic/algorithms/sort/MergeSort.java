package ws.codelogic.algorithms.sort;

public class MergeSort {

    protected void merger(Comparable[] array, Comparable[] aux, int low, int mid, int hi) {
        for(int index=low; index<=hi; index++){
            aux[index] = array[index];
        }

        int group1Start = low, group2Start = mid+1;
        for(int index=low ; index <= hi; index++){
            if(group1Start > mid){
                array[index] = aux[group2Start++];
            }else if(group2Start > hi){
                array[index] = aux[group1Start++];
            }else if(less(aux[group2Start], aux[group1Start])){
                array[index] = aux[group2Start++];
            }else{
                array[index] = aux[group1Start++];
            }
        }
    }

   private boolean less(Comparable less, Comparable greater){
       return less.compareTo(greater) == -1;
   }


}
