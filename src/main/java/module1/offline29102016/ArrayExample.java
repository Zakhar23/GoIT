package module1.offline29102016;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {1, 50, 41, 9};

        int[] array1 = new int[5];
        array1[4] = 10;

        //System.out.println(Arrays.toString(array1));

        //циклы
        int index = array.length - 1;
        while (index >= 0) {

            //System.out.println(array[index]);

            index--;
        }

        for (int anArray1 : array1) {
            System.out.println(anArray1);
        }

        System.out.println("==============");

        for (int item : array1) {
            System.out.println(item);
        }

    }
}
