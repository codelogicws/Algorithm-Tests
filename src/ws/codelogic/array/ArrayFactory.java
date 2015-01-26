package ws.codelogic.array;

import java.util.Random;

public class ArrayFactory {

    private static Random random = new Random();

    public static int[][] makeInt2DArray(int min, int max, int length, int width){
        int[][] array = new int[length][width];
        for(int i=0;i<length;i++){
            array[i] = makeIntArray(min, max, width);
        }
        return array;
    }

    public static int[] makeIntArray(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int randomNum = random.nextInt((max - min) + 1) + min;
            array[i] = randomNum;
        }
        return array;
    }

    public static Integer[] getOrderedIntegerArray(int size){
        Integer[] array = new Integer[size];
        for(int i=0;i<array.length;i++){
            array[i] = i;
        }
        return array;
    }

    public static int[] getOrderedArray(int size){
        int[] array = new int[size];
        for(int i=0;i<array.length;i++){
            array[i] = i;
        }
        return array;
    }

    public static Integer[] getRepeatArray(int size, int fillArrayWith){
        Integer[] array = new Integer[size];
        for(int i=0;i<size;i++){
            array[i] = fillArrayWith;
        }
        return array;
    }

}
