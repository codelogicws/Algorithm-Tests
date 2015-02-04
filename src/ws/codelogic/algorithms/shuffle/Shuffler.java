package ws.codelogic.algorithms.shuffle;

import java.util.Random;

public class Shuffler {

    private Random random = new Random();
    private int[] shuffledArray;

    public int[] shuffle(int[] sorted) {
        shuffledArray = sorted.clone();
        for(int i=0;i<sorted.length;i++){
            swap(i, random(i));
        }
        printShuffledArray(sorted);
        return shuffledArray;
    }

    private void swap(int i, int random) {
        int temp = shuffledArray[i];
        shuffledArray[i] = shuffledArray[random];
        shuffledArray[random] = temp;
    }

    private int random(int index){
        if(index > 0){
            return random.nextInt(index);
        }
        return 0;
    }

    private void printShuffledArray(int[] array){
        for(int i : array){
            System.out.print(i + ", ");
        }
    }
}
