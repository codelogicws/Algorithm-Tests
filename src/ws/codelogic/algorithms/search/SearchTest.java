package ws.codelogic.algorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    private Search search;

    @Test(timeout = 2000)
    public void testHasMatch() throws Exception {
        search = SearchFactory.makeBinary(30);
        testTrueCases(30);
        testElementFalse(31);
        testElementFalse(-1);
    }

    private void testTrueCases(int arraySize){
        for(int i=0;i<arraySize;i++){
            testElementTrue(i);
        }
    }

    private void testElementTrue(int number){
        assertTrue("Search should have found " + number + " but didn't ", search.hasMatch(number));
    }

    private void testElementFalse(int number){
        assertFalse("Search should not have found the element " + number, search.hasMatch(number));
    }
}