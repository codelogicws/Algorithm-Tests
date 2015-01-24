package ws.codelogic.algorithms.find.unionfind;

public class UnionFindEager implements UnionFind<Integer>{

    private Integer[] array;

    protected UnionFindEager(Integer size){
        array = new Integer[size];
    }

    @Override
    public void union(Integer object1, Integer object2) {
        boolean idsDifferent = isConnected(object1, object2);
        if(idsDifferent){
            merge(object1, object2);
        }
    }

    private void merge(Integer id1, Integer id2){
        if(id1 > id2){
            idChange(id1, id2);
        }else if(id1 < id2){
            idChange(id2, id1);
        }
    }

    private void idChange(Integer toChange, Integer newId){
        for(int i=0;i<array.length;i++){
            if(array[i].equals(toChange)){
                array[i] = newId;
            }
        }
    }

    @Override
    public boolean connected (Integer object1, Integer object2) {
        return isConnected(object1, object2);
    }

    private boolean isConnected(Integer int1, Integer int2){
        return array[int1].equals(array[int2]);
    }
}
