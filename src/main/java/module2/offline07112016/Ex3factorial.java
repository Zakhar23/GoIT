package module2.offline07112016;

public class Ex3factorial {
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

    private static void factorial(int jj, int kk) {

        if (kk == 1) {
            System.out.println(jj);
            return;
        }

        jj *= kk;
        kk--;

        factorial(jj, kk);

    }
}
