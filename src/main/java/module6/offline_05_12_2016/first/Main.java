package module6.offline_05_12_2016.first;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 100;

        int[] ar = qwerty.getArray20int(a, b);
        System.out.println(Arrays.toString(ar));

        System.out.println("=========");

        int[] arrayInt = new int[20];

        for (int k = 0; k < arrayInt.length; k++) {
            arrayInt[k] = qwerty.get20int(a, b);
        }

        System.out.println(Arrays.toString(arrayInt));
    }
}
