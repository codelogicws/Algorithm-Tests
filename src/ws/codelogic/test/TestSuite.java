package ws.codelogic.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ws.codelogic.algorithms.Stack.ArrayStackTest;
import ws.codelogic.algorithms.Stack.LinkStackTest;
import ws.codelogic.algorithms.arithmetic.evaluation.DijkstrasTwoStackTest;
import ws.codelogic.algorithms.search.SearchTest;
import ws.codelogic.algorithms.shuffle.Shuffler;
import ws.codelogic.algorithms.sort.InsertionSortTest;
import ws.codelogic.algorithms.sort.SelectionSortTest;
import ws.codelogic.algorithms.sort.ShellSort;
import ws.codelogic.algorithms.sort.ShellSortTest;
import ws.codelogic.algorithms.union.UnionTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        UnionTest.class,
        InsertionSortTest.class,
        SelectionSortTest.class,
        SearchTest.class,
        ShellSortTest.class,
        DijkstrasTwoStackTest.class,
        ArrayStackTest.class,
//        Shuffler.class,
        LinkStackTest.class})
public class TestSuite {
}
