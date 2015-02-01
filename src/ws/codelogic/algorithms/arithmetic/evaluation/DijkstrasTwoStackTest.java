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

    @Test
    public void tryAnotherExpression() {
        DijkstrasTwoStack evaluation = new DijkstrasTwoStack("(1+((6/2)+(6-2)))");
        String test = evaluation.solve();
        String realAnswer = (1+(6/2)+(6-2)) + "";
        assertEquals(realAnswer, test);
    }

}
