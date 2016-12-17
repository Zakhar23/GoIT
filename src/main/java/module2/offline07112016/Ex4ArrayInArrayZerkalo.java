package module2.offline07112016;

import java.util.Arrays;
import java.util.Random;

public class Ex4ArrayInArrayZerkalo {
    public static void main(String[] args) {
        int n = 5;
        int[][] arrayMatrix = new int[n][n];

        for (int i = 1; i <= 5; i++) {
            arrayMatrix[i - 1] = createMatrix(n);
            System.out.println(Arrays.toString(arrayMatrix[i - 1]));
        }

        /*for (int i = n; i > 0; i--) {
            //int[] vrem = arrayMatrix[i-1];
            for (int j = n; j > 0; j--) {
                System.out.print(arrayMatrix[i - 1][j - 1]);
            }
            System.out.println("");
        }*/
        System.out.println("");

        n = 5;
        int[][] arrayMatrixRevert = new int[n][n];
        for (int i = n; i > 0; i--) {
            int[] cre = new int[n];
            for (int j = n; j > 0; j--) {
                cre[n - j] = arrayMatrix[i - 1][j - 1];
            }
            arrayMatrixRevert[i - 1] = cre;
            System.out.println(Arrays.toString(cre));
        }

    }


    static int[] createMatrix(int n) {
        int[] newArray = new int[n];

        Random number = new Random();

        for (int i = 0; i < n; i++) {
            newArray[i] = number.nextInt(100);
        }

        return newArray;
    }
}
