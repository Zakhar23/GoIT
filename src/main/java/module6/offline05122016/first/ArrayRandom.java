package module6.offline05122016.first;

import java.util.Random;

public class ArrayRandom {
    static int[] getArray20int(int aa, int bb) {
        int[] arrayInt = new int[20];
        Random random = new Random();

        for (int k = 0; k < arrayInt.length; k++) {

            arrayInt[k] = aa + random.nextInt(bb - aa + 1);
        }

        return arrayInt;
    }

    static int get20int(int aa, int bb) {
        Random random = new Random();
        return aa + random.nextInt(bb - aa + 1);
    }
}
