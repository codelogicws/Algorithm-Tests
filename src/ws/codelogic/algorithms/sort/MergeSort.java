package ws.codelogic.algorithms.sort;

public class MergeSort {

    private int group1Selection, group2Selection;
    private Comparable[] aux;

    protected void merger(Comparable[] array, Comparable[] emptyAux, int low, int mid, int hi) {
        setGroupSelections(low, mid);
        copyToAux(array, emptyAux, low, hi);

        for(int index=low ; index <= hi; index++){
            if( group1OutOfBounds(mid) ){
                array[index] = aux[group2Selection++];
            }else if( group2OutOfBounds(hi) ){
                array[index] = aux[group1Selection++];
            }else if( group2SelectionLessThenGroup1() ){
                array[index] = aux[group2Selection++];
            }else{
                array[index] = aux[group1Selection++];
            }
        }
    }

    private void setGroupSelections(int low, int mid) {
        group1Selection = low;
        group2Selection = mid+1;
    }

    private void copyToAux(Comparable[] array, Comparable[] aux, int low, int hi) {
        this.aux = aux;
        for(int index=low; index<=hi; index++){
            aux[index] = array[index];
        }

    }

    private boolean group1OutOfBounds(int mid) {
        return group1Selection > mid;
    }

    private boolean group2OutOfBounds(int hi){
        return group2Selection > hi;
    }

    private boolean group2SelectionLessThenGroup1(){
        return less(aux[group2Selection], aux[group1Selection]);
    }

    private boolean less(Comparable less, Comparable greater){
       return less.compareTo(greater) == -1;
   }


}
