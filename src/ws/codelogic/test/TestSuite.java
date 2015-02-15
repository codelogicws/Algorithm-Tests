package ws.codelogic.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ws.codelogic.algorithms.Stack.ArrayStackTest;
import ws.codelogic.algorithms.Stack.LinkStackTest;
import ws.codelogic.algorithms.arithmetic.evaluation.DijkstrasTwoStackTest;
import ws.codelogic.algorithms.priorityqueue.PriorityQueueTest;
import ws.codelogic.algorithms.search.SearchTest;
import ws.codelogic.algorithms.selection.QuickSelectTest;
import ws.codelogic.algorithms.shuffle.ShufflerTest;
import ws.codelogic.algorithms.sort.*;
import ws.codelogic.algorithms.sort.duplicates.Dijkstras3WayPartitionTest;
import ws.codelogic.algorithms.union.UnionTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PriorityQueueTest.class,
        Dijkstras3WayPartitionTest.class,
        QuickSelectTest.class,
        QuickSortTest.class,
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
