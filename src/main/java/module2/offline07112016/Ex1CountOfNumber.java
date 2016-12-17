package module2.offline07112016;


public class Ex1CountOfNumber {
    public static void main(String[] args) {

        int[] array = {10, 15, 23, 10, 10, 78, 95, 1, 2, 8, 6, 12, 10};
        int nn = 10;
        int kk = countOfN(nn, array);

        if (kk == 0) {
            System.out.println("no");
        } else if (kk == 1) {
            System.out.println("yes");
        } else {
            System.out.println(kk);
        }
    }

    private static int countOfN(int n, int[] array) {

        int kk = 0;

        for (int item : array) {
            if (item == n)
                kk++;
        }

        return kk;
    }


}
