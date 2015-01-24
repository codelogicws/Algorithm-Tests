package ws.codelogic.algorithms.find.unionfind

import org.junit.Test;

import static org.junit.Assert.assertTrue;

class UnionFindEagorTest{

    private UnionFind unionFind;

    @Test
    void testUnion() {
        unionFind = UnionFindFactory.makeEager(5);
        unionFind.union(1,0);
        unionFind.union(1,4);
        unionFind.union(4,5);
        assertTrue(false);
    }

//    void testConnected() {
//    }

}
