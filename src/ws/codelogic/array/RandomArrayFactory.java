package ws.codelogic.array;

import java.util.Random;

public class RandomArrayFactory {

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
        for (int i=0;i<length;i++) {
            int randomNum = random.nextInt((max - min) + 1) + min;
            array[i] = randomNum;
        }
        return array;
    }

}
