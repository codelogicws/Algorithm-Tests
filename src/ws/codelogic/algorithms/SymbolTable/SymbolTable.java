package ws.codelogic.algorithms.SymbolTable;

public class SymbolTable <T>{

    Comparable[] keys;
    T[] values;
    int currentIndex = -1;

    public SymbolTable(T[] emptyValuesArray){
        keys = new Comparable[emptyValuesArray.length];
        values = emptyValuesArray;
    }

    private void add(Comparable key, T value){
        currentIndex ++;
        throwOverFlowIfLarge();
        keys[currentIndex] = key;
        values[currentIndex] = value;
    }

    private void throwOverFlowIfLarge() {
        if(currentIndex >= values.length){
            throw new SymbolTableExceptions.OverFlow();
        }
    }

    public T get(Comparable key){
        for(int i=0;i<keys.length;i++){
            if(key == keys[i]){
                return values[i];
            }
        }
        return null;
    }

    public boolean contains(Comparable key){
        return (get(key) != null);
    }

    public void put(Comparable key, T value){
        boolean doesNotContain = !contains(key);
        if(doesNotContain){
            add(key, value);
        }
    }

}
