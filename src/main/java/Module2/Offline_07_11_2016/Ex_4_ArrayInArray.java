package main.java.Module2.Offline_07_11_2016;

import java.util.Arrays;
import java.util.Random;

public class Ex_4_ArrayInArray {
    public static void main(String[] args) {
        int n = 5;
        int[][] arrayMatrix = new int[n][n];

        for (int i = 0; i<5; i++){
            arrayMatrix[i] = createMatrix(n);
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
}
