package ws.codelogic.algorithms.shuffle;

import java.util.Random;

public class Shuffler {

    private Random random = new Random();
    private Comparable temp;
    private Comparable[] array;

    public void shuffle(Comparable[] array) {
        this.array = array;
        for(int i=0;i<array.length;i++){
            swap(i, random(i));
        }
    }

    private void swap(int i, int random) {
        temp = array[i];
        array[i] = array[random];
        array[random] = temp;
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
