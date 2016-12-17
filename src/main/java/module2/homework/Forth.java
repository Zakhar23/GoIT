package module2.homework;

public class Forth {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        double rechargeAmount = 200;

        System.out.println(addCash(balances, ownerNames, ownerName, rechargeAmount));
    }

    private static String addCash(int[] balanses, String[] ownerNames, String ownerName, double rechargeAmount) {
        int numberOfPerson = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                numberOfPerson = i;
                break;
            }
        }

        balanses[numberOfPerson] += rechargeAmount;
        return ownerName + " " + balanses[numberOfPerson];
    }
}
