package Module1.offline1_29102016;

/**
 * Created by Home on 29.10.2016.
 */
public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {1,50,41,9};

        int[] array1 = new int[5];
        array1[4] = 10;

        //System.out.println(Arrays.toString(array1));

        //циклы
        int index = array.length-1;
        while (index>=0){

            //System.out.println(array[index]);

            index --;
        }

        for(int i = 0; i< array1.length;i++){
            System.out.println(array1[i]);
        }

        System.out.println("==============");

        for (int item : array1){
            System.out.println(item);
        }

    }
}
