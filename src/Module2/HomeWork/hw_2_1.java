package Module2.HomeWork;

/**
 * Created by kyrychenko on 04.11.2016.
 */
public class hw_2_1 {
    public static void main(String[] args) {

        int[] MyArray = {10, 8, 47, 42, 3, -8, -45, 8, 1, -13};
        //int[] MyArray = {-10, -8, -47, -42, -3, -8, -45, -8, -1, -13};

        //System.out.println(sum(MyArray));
        //System.out.println(min(MyArray));
        //System.out.println(max(MyArray));
        //int maxPositive = maxPositive(MyArray);
        //System.out.println(maxPositive==0 ? "нет позитивных чисел (значение больше 0)" : maxPositive);
        //System.out.println(multiplication(MyArray));
        //modulus(MyArray);
        System.out.println(secondLargest(MyArray));

    }

    static int secondLargest(int MyArray[])
    {
        int secondLargest = 1;

        for (int item: MyArray)
        {
            secondLargest *= item;
        }

        return secondLargest;
    }

    static void modulus(int MyArray[])
    {
        int first = MyArray[0];
        int second = MyArray[MyArray.length-1];

        System.out.println(first < 0 ? first*-1 : first);
        System.out.println(second < 0 ? second*-1 : second);

    }

    static int multiplication(int MyArray[])
    {
        int multiplication = 1;

        for (int item: MyArray)
        {
            multiplication *= item;
        }

        return multiplication;
    }

    static int maxPositive(int MyArray[])
    {
        int maxPositive = 0;

        for (int item: MyArray)
        {
            if (item > maxPositive)
                maxPositive = item;
        }

        return maxPositive;
    }

    static int max(int MyArray[])
    {
        int max = Integer.MIN_VALUE;

        for (int item: MyArray)
        {
            if (item > max)
                max = item;
        }

        return max;
    }

    static int min(int MyArray[])
    {
        int min = Integer.MAX_VALUE;

        for (int item: MyArray)
        {
           if (item < min)
               min = item;
        }

        return min;
    }

    static int sum(int MyArray[])
    {
        int sum = 0;

        for (int item: MyArray)
        {
            sum += item;
        }

        return sum;
    }


}
