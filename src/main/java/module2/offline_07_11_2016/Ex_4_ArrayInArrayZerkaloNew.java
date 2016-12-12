package module2.offline_07_11_2016;

import java.util.Arrays;
import java.util.Random;

public class Ex_4_ArrayInArrayZerkaloNew {
    public static void main(String[] args) {
        int n = 5;
        int[][] arrayMatrix = new int[n][n];

        for (int i = 0; i<5; i++){
            arrayMatrix[i] = createMatrix(n);
            System.out.println(Arrays.toString(arrayMatrix[i]));
        }

        int[][] arrayMatrixZ = new int[n][n];

        for (int i = n; i<0; i--){
            arrayMatrixZ[i] = createMatrixZ(n);
            System.out.println(Arrays.toString(arrayMatrix[i]));
        }
        //System.out.println(Arrays.toString(arrayMatrix));
    }

    static int[] createMatrix(int n){
        int[] newArray = new int[n];

        Random number = new Random();

        for (int i = 0; i < n; i++){
           newArray[i] = number.nextInt(100);
        }

        return newArray;
    }

    static int[] createMatrixZ(int n){
        int[] newArray = new int[n];

        Random number = new Random();

        for (int i = n; i > 0; i--){
            newArray[i] = number.nextInt(100);
        }

        return newArray;
    }
}
