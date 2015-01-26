package ws.codelogic.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ws.codelogic.algorithms.search.SearchTest;
import ws.codelogic.algorithms.union.UnionTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({UnionTest.class, SearchTest.class})
public class TestSuite {
}
