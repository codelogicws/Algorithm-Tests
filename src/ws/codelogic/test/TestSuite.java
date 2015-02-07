package ws.codelogic.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ws.codelogic.algorithms.Stack.ArrayStackTest;
import ws.codelogic.algorithms.Stack.LinkStackTest;
import ws.codelogic.algorithms.arithmetic.evaluation.DijkstrasTwoStackTest;
import ws.codelogic.algorithms.search.SearchTest;
import ws.codelogic.algorithms.shuffle.ShufflerTest;
import ws.codelogic.algorithms.sort.InsertionSortTest;
import ws.codelogic.algorithms.sort.MergeSortTest;
import ws.codelogic.algorithms.sort.SelectionSortTest;
import ws.codelogic.algorithms.sort.ShellSortTest;
import ws.codelogic.algorithms.union.UnionTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MergeSortTest.class,
        UnionTest.class,
        InsertionSortTest.class,
        SelectionSortTest.class,
        SearchTest.class,
        ShellSortTest.class,
        DijkstrasTwoStackTest.class,
        ArrayStackTest.class,
        ShufflerTest.class,
        LinkStackTest.class})
public class TestSuite {
}
