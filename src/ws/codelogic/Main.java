package ws.codelogic;

import ws.codelogic.array.ArrayFactory;
import ws.codelogic.array.ArrayUtil;

public class Main {

    public static void main(String[] args) {

        int[] testArray = ArrayFactory.makeIntArray(1, 400, 10);
        ArrayUtil.print(testArray);

        int[][] test2DArray = ArrayFactory.makeInt2DArray(1, 400, 5, 10);
        ArrayUtil.print(test2DArray);

    }

}
