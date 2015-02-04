package ws.codelogic.algorithms.shuffle;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ShufflerTest {

    private Shuffler shuffler;
    private int[] sorted = {1,2,3,4,5,6,7,8,9};

    @Before
    public void setup() {
        shuffler = new Shuffler();
    }

    @Test
    public void testItemsAreNotInTheSortedOrderTheyWhereSentIn() {
        int[] shuffled = shuffler.shuffle(sorted);
        assertFalse(arraysNotEqual(shuffled, sorted));
    }

    private boolean arraysNotEqual(int[] array1, int[] array2){
        boolean arraysEqual = true;
        if(array1.length != array2.length){
            arraysEqual = false;
        }else{
            for(int i=0;i<array1.length;i++){
                if(array1[i] != array2[i]){
                    arraysEqual = false;
                    break;
                }
            }
        }
        return arraysEqual;
    }
}
