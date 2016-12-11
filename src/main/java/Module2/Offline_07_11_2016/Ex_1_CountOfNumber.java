package Module2.Offline_07_11_2016;


public class Ex_1_CountOfNumber {
    public static void main(String[] args) {

        int[] array = {10,15,23,10,10,78,95,1,2,8,6,12,10};
        int n = 10;
        int k = countOfN(n,array);

        if (k==0){
            System.out.println("no");
        }else if (k==1){
            System.out.println("yes");
        }else {
            System.out.println(k);
        }
    }

    static int countOfN(int n, int[] array){

        int k = 0;

        for (int item : array) {
            if (item == n)
                k++;
        }

        return k;
    }


}
