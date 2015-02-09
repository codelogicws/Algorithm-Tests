package ws.codelogic.algorithms.Commons;

public class Exchange {

    private static Comparable temp;

    public static void exchangeElements(Comparable[] a, int index1, int index2){
        temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
