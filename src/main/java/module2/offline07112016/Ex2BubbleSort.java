package module2.offline07112016;

import java.util.Arrays;

public class Ex2BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 4, 1, 12, 78, 5, 32, 12};
        System.out.println(Arrays.toString(array));

        for (int count : array) {


            for (int i = 0; i < array.length - 2; i++) {
                int k = array[i];
                if (k > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
