
package module2.homework;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {

        int[] myArrayInt = {10, 8, 2, 7, 3, -8, -9, 8, 1, -13};
        double[] myArrayDouble = {10.0, 8.0, 2.0, 7.0, 3.0, -8.0, -9.0, 8.0, 1.0, -13.0};

        System.out.println(sum(myArrayInt));
        System.out.println(min(myArrayInt));
        System.out.println(max(myArrayInt));
        int maxPositiveInt = maxPositive(myArrayInt);
        System.out.println(maxPositiveInt == 0
                ? "нет позитивных чисел (значение больше 0)"
                : maxPositiveInt);
        System.out.println(multiplication(myArrayInt));
        modulus(myArrayInt);
        System.out.println(secondLargest(myArrayInt));
        System.out.println(Arrays.toString(myArrayInt));

        System.out.println("=============");

        System.out.println(sum(myArrayDouble));
        System.out.println(min(myArrayDouble));
        System.out.println(max(myArrayDouble));
        double maxPositiveDouble = maxPositive(myArrayDouble);
        System.out.println(maxPositiveDouble == 0
                ? "нет позитивных чисел (значение больше 0)"
                : maxPositiveDouble);
        System.out.println(multiplication(myArrayDouble));
        modulus(myArrayDouble);
        System.out.println(secondLargest(myArrayDouble));

    }

    private static int secondLargest(int[] myArray) {

        int[] copyArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(copyArray);

        return copyArray[copyArray.length - 2];
    }

    private static void modulus(int[] myArray) {

        int first = myArray[0];
        int second = myArray[myArray.length - 1];

        System.out.println(first < 0 ? first * -1 : first);
        System.out.println(second < 0 ? second * -1 : second);

    }

    private static int multiplication(int[] myArray) {
        int multiplication = 1;

        for (int item : myArray) {
            multiplication *= item;
        }

        return multiplication;
    }

    private static int maxPositive(int[] myArray) {
        int maxPositive = 0;

        for (int item : myArray) {
            if (item > maxPositive) {
                maxPositive = item;
            }
        }

        return maxPositive;
    }

    private static int max(int[] myArray) {
        int max = Integer.MIN_VALUE;

        for (int item : myArray) {
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

    private static int min(int[] myArray) {
        int min = Integer.MAX_VALUE;

        for (int item : myArray) {
            if (item < min) {
                min = item;
            }
        }

        return min;
    }

    private static int sum(int[] myArray) {
        int sum = 0;

        for (int item : myArray) {
            sum += item;
        }

        return sum;
    }


    private static double secondLargest(double[] myArray) {

        double[] copyArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(copyArray);

        return copyArray[copyArray.length - 2];
    }

    private static void modulus(double[] myArray) {

        double first = myArray[0];
        double second = myArray[myArray.length - 1];

        System.out.println(first < 0 ? first * -1 : first);
        System.out.println(second < 0 ? second * -1 : second);

    }

    private static double multiplication(double[] myArray) {
        double multiplication = 1.0;

        for (double item : myArray) {
            multiplication *= item;
        }

        return multiplication;
    }

    private static double maxPositive(double[] myArray) {
        double maxPositive = 0;

        for (double item : myArray) {
            if (item > maxPositive) {
                maxPositive = item;
            }
        }

        return maxPositive;
    }

    private static double max(double[] myArray) {
        double max = Integer.MIN_VALUE;

        for (double item : myArray) {
            if (item > max) {
                max = item;
            }

        }

        return max;
    }

    private static double min(double[] myArray) {
        double min = Integer.MAX_VALUE;

        for (double item : myArray) {
            if (item < min) {
                min = item;
            }
        }

        return min;
    }

    private static double sum(double[] myArray) {
        double sum = 0;

        for (double item : myArray) {
            sum += item;
        }

        return sum;
    }

}
