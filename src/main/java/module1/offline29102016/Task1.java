package module1.offline29102016;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] balances = {100, 5400, 4321, 900, -50, 0};
        String[] names = {"Vika", "Pasha", "Oleg", "Vania", "Sam", "Olga"};

        int count = 0;
        for (int bal : balances) {
            if (bal > 1000) {
                count = count + 1;
            }
        }

        String[] owners = new String[count];
        int index = 0;
        int indexOwners = 0;
        for (int bal : balances) {
            if (bal > 1000) {
                owners[indexOwners] = names[index];
                indexOwners++;
            }
            index++;
        }

        System.out.println(Arrays.toString(owners));
    }
}
