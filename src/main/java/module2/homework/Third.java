package module2.homework;

public class Third {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        double withdrawal = 200;

        System.out.println(getCash(balances, ownerNames, ownerName, withdrawal));
    }

    private static String getCash(int[] balanses, String[] ownerNames, String ownerName, double withdrawal) {
        double commissions = withdrawal * 0.05;
        int numberOfPerson = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                numberOfPerson = i;
                break;
            }
        }

        if ((double) balanses[numberOfPerson] < (withdrawal + commissions)) {
            return ownerName + " NO";
        } else {
            return ownerName + " " + withdrawal + " " + (balanses[numberOfPerson] - (withdrawal + commissions));
        }

    }
}
