package ws.codelogic.algorithms.selection;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSelectTest {

    private QuickSelect qSelect;

    @Before
    public void setup() {
        qSelect = new QuickSelect();
    }

    @Test
    public void testSimpleSelection() {
        Integer[] unsorted = {7,5,4,3,2,9,8};
        int searchFor = 3;
        Integer match = (Integer)qSelect.find(searchFor, unsorted);
        assertEquals(match, new Integer(5));
    }

    

}
