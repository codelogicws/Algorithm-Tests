package ws.codelogic.array;

public class ArrayUtil{

    public static void print(int[][] toPrint){
        for(int i=0;i<toPrint.length;i++){
            print(toPrint[i]);
        }
    }

    public static void print(int[] toPrint){
        for(int i=0;i<toPrint.length;i++){
            print(toPrint, i);
        }
        newLine();
    }

    private static void print(int[] toPrint, int index){
        int length = toPrint.length;
        boolean isNotLastElement = index != length -1;
        int element = toPrint[index];

        if(isNotLastElement){
            printWithComma(element);
        }else{
            print("" + element);
        }
    }

    private static void printWithComma(int i){
        print(i + ", ");
    }

    private static void print(String s){
        System.out.print(s);
    }

    private static void newLine(){
        System.out.println();
    }

}
