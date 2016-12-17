package module2.offline07112016;

import java.util.Arrays;
import java.util.Random;

public class Ex4ArrayInArray {
    public static void main(String[] args) {
        int n = 5;
        int[][] arrayMatrix = new int[n][n];

        for (int i = 0; i < 5; i++) {
            arrayMatrix[i] = createMatrix(n);
            System.out.println(Arrays.toString(arrayMatrix[i]));
        }

        //System.out.println(Arrays.toString(arrayMatrix));
    }

    static int[] createMatrix(int value) {
        int[] newArray = new int[value];

        Random number = new Random();

        for (int i = 0; i < value; i++) {
            newArray[i] = number.nextInt(100);
        }

        return newArray;
    }
}
