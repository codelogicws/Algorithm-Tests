package ws.codelogic.algorithms.shuffle;

import java.util.Random;

public class Shuffler {

    private Random random = new Random();
    private Comparable temp;
    private Comparable[] shuffledArray;

    public Comparable[] shuffle(Comparable[] sorted) {
        shuffledArray = sorted.clone();
        for(int i=0;i<sorted.length;i++){
            swap(i, random(i));
        }
        return shuffledArray;
    }

    private void swap(int i, int random) {
        temp = shuffledArray[i];
        shuffledArray[i] = shuffledArray[random];
        shuffledArray[random] = temp;
    }

    private int random(int index){
        if(index > 0){
            return random.nextInt(index);
        }
        return 0;
    }

    private void printShuffledArray(Comparable[] array){
        for(Comparable i : array){
            System.out.print(i + ", ");
        }
    }
}
