package ws.codelogic.algorithms.shuffle;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ShufflerTest {

    private Shuffler shuffler;
    private Integer[] sorted = {1,2,3,4,5,6,7,8,9};
    private Integer[] toBeShuffled = sorted.clone();

    @Before
    public void setup() {
        shuffler = new Shuffler();
    }

    @Test
    public void testItemsAreNotInTheSortedOrderTheyWhereSentIn() {
        shuffler.shuffle(toBeShuffled);
        assertTrue(arraysNotEqual(toBeShuffled, sorted));
    }

    private boolean arraysNotEqual(Comparable[] array1, Comparable[] array2){
        boolean arraysEqual = true;
        if(array1.length != array2.length){
            arraysEqual = false;
        }else{
            arraysEqual = checkForMatchs(array1, array2, arraysEqual);
        }
        return !arraysEqual;
    }

    private boolean checkForMatchs(Comparable[] array1, Comparable[] array2, boolean arraysEqual) {
        for(int i=0;i<array1.length;i++){
            if(array1[i] != array2[i]){
                arraysEqual = false;
                break;
            }
        }
        return arraysEqual;
    }
}
