package module6.homework;

import java.util.Arrays;

final class ArraysUtils {
    static int secondLargest(int[] myArray) {

        int[] copyArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(copyArray);

        return copyArray[copyArray.length - 2];
    }

    static int[] modulus(int[] myArray) {

        int first = myArray[0];
        int second = myArray[myArray.length - 1];

        int[] answer = new int[2];
        answer[0] = (first < 0 ? first * -1 : first);
        answer[1] = (second < 0 ? second * -1 : second);

        return answer;
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
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[array.length - 1 - i] = array[i];
        }
        return reverse;
    }

    static int[] findEvenElements(int[] array) {
        int[] answer = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            answer[count] = array[i + 1];
            count++;
        }
        return answer;
    }
}
