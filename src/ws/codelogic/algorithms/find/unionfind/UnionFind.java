package ws.codelogic.algorithms.find.unionfind;

public interface UnionFind <T>{
    public void union(T object1, T object2);
    public boolean connected (T object1, T object2);
}
