package main.java.Module2.Offline_07_11_2016;

public class Ex_3_factorial {
    public static void main(String[] args) {

        //факториал

        /*int k = 10;
        int j = 1;

        for (int i = 1; i<=k; i++){
           j*=i;
        }

        System.out.println(j);*/

        int j = 1;
        int k = 5;

        factorial(j, k);

    }

    private static void factorial(int j, int k) {

        if (k==1) {
            System.out.println(j);
            return;
        }

        j*=k;
        k--;

        factorial(j, k);

    }
}
