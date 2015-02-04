package ws.codelogic.algorithms.sort;

public class SelectionSort extends Sort{

    private Element lowest;
    private Element stage;
    private Element suiter;
    private final Comparable[] array;

    public SelectionSort(Comparable[] array){
        this.array = array;
    }


    public void sort() {
        for(int selected=0;selected<array.length;selected++){
            stage = new Element(selected, array);
            replaceWithSmallestUnsorted();
        }
    }

    private void replaceWithSmallestUnsorted(){
        findSmallest();
        exchangeCurrentWithLowest();
    }

    private void findSmallest(){
        lowest = new Element(stage);
        int unsortedStartIndex = stage.index + 1;
        for(int i=unsortedStartIndex; i<array.length;i++){
            suiter = new Element(i, array);
            handleSmallerValues();
        }
    }

    private void handleSmallerValues() {
        boolean unsortedSelectionIsSmallerThenCurrentLowest = lowest.isLowerThen(suiter);
        if(unsortedSelectionIsSmallerThenCurrentLowest){
            lowest.set(suiter);
        }
    }

    private void exchangeCurrentWithLowest() {
        array[stage.index] = lowest.value;
        array[lowest.index] = stage.value;
    }

    public Comparable[] getArray() {
        return array;
    }


}
