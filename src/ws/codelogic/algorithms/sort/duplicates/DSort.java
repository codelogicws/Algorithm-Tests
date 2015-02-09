package ws.codelogic.algorithms.sort.duplicates;

import ws.codelogic.algorithms.Commons.Exchange;

public class DSort{

    public void sort(Comparable[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if(hi <= lo) return;
        int lt = lo, gt = hi;
        Comparable v = a[lo];
        int i = lo;
        while(i <= gt){
            int cmp = a[i].compareTo(v);
            if(cmp < 0) exch(a, lt++, i++);
            else if (cmp>0) exch(a, i, gt--);
            else i++;
        }
        sort(a, lo, lt-1);
        sort(a, gt + 1, hi);
    }

    private static void exch(Comparable[] a, int i1, int i2){
        Exchange.exchangeElements(a, i1, i2);
    }

}
