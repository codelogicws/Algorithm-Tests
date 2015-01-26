package ws.codelogic.algorithms.search;

public class BinarySearch implements Search{

    private int min;
    private int max;
    private int mid;
    private int[] array;

    protected BinarySearch(int[] array){
        this.array = array;
    }

    @Override
    public boolean hasMatch(int checkFor) {
        min = 0;
        max = array.length - 1;
        boolean doesExist = searchMatch(checkFor);
        return doesExist;
    }

    private boolean searchMatch(int key){
        boolean isMatch = false;
        while(min <= max){
            int mid = min + (max-min) / 2;
            if(key < array[mid]){
                max = mid -1;
            }else if(key > array[mid]){
                min = mid + 1;
            }else{
                isMatch = true;
                break;
            }
        }
        return isMatch;
    }

}
