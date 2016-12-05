package main.java.module6.offline_05_12_2016.first;

import java.util.Random;

public class qwerty {
    static int[] getArray20int(int a, int b) {
        int[] arrayInt = new int[20];
        Random random = new Random();

        for (int k = 0; k < arrayInt.length; k++) {

            arrayInt[k] = a + random.nextInt(b - a + 1);
        }

        return arrayInt;
    }

    static int get20int(int a, int b) {
        Random random = new Random();
        return a + random.nextInt(b - a + 1);
    }
}
