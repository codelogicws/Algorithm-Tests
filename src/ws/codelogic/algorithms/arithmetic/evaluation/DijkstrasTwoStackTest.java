package ws.codelogic.algorithms.arithmetic.evaluation;

import static org.junit.Assert.*;
import org.junit.Test;

public class DijkstrasTwoStackTest {

    private String evaluationString = "(1+((2+3)*(4*5)))";

    @Test
    public void acceptsStringToWorkOn() {
        DijkstrasTwoStack evaluation = new DijkstrasTwoStack(evaluationString);
        String test = evaluation.solve();
        assertEquals("101", test);
    }

}
