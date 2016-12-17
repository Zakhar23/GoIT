package module2.offline07112016;

import java.util.Arrays;
import java.util.Random;

public class Ex4ArrayInArrayZerkaloNew {
    public static void main(String[] args) {
        int n = 5;
        int[][] arrayMatrix = new int[n][n];

        for (int i = 0; i < 5; i++) {
            arrayMatrix[i] = createMatrix(n);
            System.out.println(Arrays.toString(arrayMatrix[i]));
        }

        int[][] arrayMatrixZ = new int[n][n];

        for (int i = n; i < 0; i--) {
            arrayMatrixZ[i] = createMatrixZ(n);
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

    static int[] createMatrixZ(int value) {
        int[] newArray = new int[value];

        Random number = new Random();

        for (int i = value; i > 0; i--) {
            newArray[i] = number.nextInt(100);
        }

        return newArray;
    }
}
