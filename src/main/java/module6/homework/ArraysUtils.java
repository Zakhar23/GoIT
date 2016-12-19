package module6.homework;

import java.util.Arrays;

final public class ArraysUtils {
    static int secondLargest(int[] myArray) {

        int[] copyArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(copyArray);

        return copyArray[copyArray.length - 2];
    }

    static void modulus(int[] myArray) {

        int first = myArray[0];
        int second = myArray[myArray.length - 1];

        System.out.println(first < 0 ? first * -1 : first);
        System.out.println(second < 0 ? second * -1 : second);

    }

    static int multiplication(int[] myArray) {
        int multiplication = 1;

        for (int item : myArray) {
            multiplication *= item;
        }

        return multiplication;
    }

    static int maxPositive(int[] myArray) {
        int maxPositive = 0;

        for (int item : myArray) {
            if (item > maxPositive) {
                maxPositive = item;
            }
        }

        return maxPositive;
    }

    static int max(int[] myArray) {
        int max = Integer.MIN_VALUE;

        for (int item : myArray) {
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

    static int min(int[] myArray) {
        int min = Integer.MAX_VALUE;

        for (int item : myArray) {
            if (item < min) {
                min = item;
            }
        }

        return min;
    }

    static int sum(int[] myArray) {
        int sum = 0;

        for (int item : myArray) {
            sum += item;
        }

        return sum;
    }

    static int[] reverse(int[] array) {
        return new int[0];
    }

    static int[] findEvenElements(int[] array) {
        return new int[0];
    }
}
