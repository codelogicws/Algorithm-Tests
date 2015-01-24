package ws.codelogic.algorithms.find.unionfind;

public class UnionFindFactory {

    public static UnionFind makeEager(int size){
        return new UnionFindEager(size);
    }
}
