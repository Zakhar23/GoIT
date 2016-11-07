/*
*hw_2_1
*
*version 1.0
*
*created by Zakhar
*/

package Module2.HomeWork;

import java.util.Arrays;

public class hw_2_1 {
    public static void main(String[] args) {

        int[] MyArrayInt = {10, 8, 2, 7, 3, -8, -9, 8, 1, -13};

        double[] MyArrayDouble = {10.0, 8.0, 2.0, 7.0, 3.0, -8.0, -9.0, 8.0, 1.0, -13.0};

        System.out.println(sumInt(MyArrayInt));
        System.out.println(minInt(MyArrayInt));
        System.out.println(maxInt(MyArrayInt));
        int maxPositiveInt = maxPositiveInt(MyArrayInt);
        System.out.println(maxPositiveInt == 0
                ? "нет позитивных чисел (значение больше 0)"
                : maxPositiveInt);
        System.out.println(multiplicationInt(MyArrayInt));
        modulusInt(MyArrayInt);
        System.out.println(secondLargestInt(MyArrayInt));

        System.out.println("=============");

        System.out.println(sumDouble(MyArrayDouble));
        System.out.println(minDouble(MyArrayDouble));
        System.out.println(maxDouble(MyArrayDouble));
        double maxPositiveDouble = maxPositiveDouble(MyArrayDouble);
        System.out.println(maxPositiveDouble == 0
                ? "нет позитивных чисел (значение больше 0)"
                : maxPositiveDouble);
        System.out.println(multiplicationDouble(MyArrayDouble));
        modulusDouble(MyArrayDouble);
        System.out.println(secondLargestDouble(MyArrayDouble));

    }

    static int secondLargestInt(int MyArray[]) {
        Arrays.sort(MyArray);

        int secondLargest = MyArray[MyArray.length - 2];

        return secondLargest;
    }

    static void modulusInt(int MyArray[]) {
        int first = MyArray[0];
        int second = MyArray[MyArray.length - 1];

        System.out.println(first < 0 ? first * -1 : first);
        System.out.println(second < 0 ? second * -1 : second);

    }

    static int multiplicationInt(int MyArray[]) {
        int multiplication = 1;

        for (int item : MyArray) {
            multiplication *= item;
        }

        return multiplication;
    }

    static int maxPositiveInt(int MyArray[]) {
        int maxPositive = 0;

        for (int item : MyArray) {
            if (item > maxPositive)
                maxPositive = item;
        }

        return maxPositive;
    }

    static int maxInt(int MyArray[]) {
        int max = Integer.MIN_VALUE;

        for (int item : MyArray) {
            if (item > max)
                max = item;
        }

        return max;
    }

    static int minInt(int MyArray[]) {
        int min = Integer.MAX_VALUE;

        for (int item : MyArray) {
            if (item < min)
                min = item;
        }

        return min;
    }

    static int sumInt(int MyArray[]) {
        int sum = 0;

        for (int item : MyArray) {
            sum += item;
        }

        return sum;
    }


    static double secondLargestDouble(double MyArray[]) {
        Arrays.sort(MyArray);

        double secondLargest = MyArray[MyArray.length - 2];

        return secondLargest;
    }

    static void modulusDouble(double MyArray[]) {
        double first = MyArray[0];
        double second = MyArray[MyArray.length - 1];

        System.out.println(first < 0 ? first * -1 : first);
        System.out.println(second < 0 ? second * -1 : second);

    }

    static double multiplicationDouble(double MyArray[]) {
        double multiplication = 1.0;

        for (double item : MyArray) {
            multiplication *= item;
        }

        return multiplication;
    }

    static double maxPositiveDouble(double MyArray[]) {
        double maxPositive = 0;

        for (double item : MyArray) {
            if (item > maxPositive)
                maxPositive = item;
        }

        return maxPositive;
    }

    static double maxDouble(double MyArray[]) {
        double max = Integer.MIN_VALUE;

        for (double item : MyArray) {
            if (item > max)
                max = item;
        }

        return max;
    }

    static double minDouble(double MyArray[]) {
        double min = Integer.MAX_VALUE;

        for (double item : MyArray) {
            if (item < min)
                min = item;
        }

        return min;
    }

    static double sumDouble(double MyArray[]) {
        double sum = 0;

        for (double item : MyArray) {
            sum += item;
        }

        return sum;
    }

}
