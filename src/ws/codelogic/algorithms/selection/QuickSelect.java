package ws.codelogic.algorithms.selection;

import ws.codelogic.algorithms.shuffle.Shuffler;

public class QuickSelect {

    private static Comparable temp;

    public Comparable find(int k, Comparable[] a) {
        shuffle(a);
        int lo = 0, hi = a.length - 1;

        while(hi > lo){
            int j = partition(a, lo, hi);

            if(j < k){
                lo = j + 1;
            }else if(j > k){
                hi = j - 1;
            }else{
                return a[k];
            }
        }
        return a[k];
    }

    private void shuffle(Comparable[] unsorted) {
        Shuffler shuffler = new Shuffler();
        shuffler.shuffle(unsorted);
    }

    private int partition(Comparable[] a, int lo, int hi){
        int i = lo, j = hi + 1;
        while(true){
            while(less(a[++i], a[lo]))
                if(i==hi) break;
            while(less(a[lo], a[--j]))
                if(j == lo) break;

            if(i >= j) break;
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable less, Comparable more){
        return less.compareTo(more) < 0;
    }

    private static void exch(Comparable[] array, int first, int second){
        temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


}
