package Module2.HomeWork;

public class hw_2_4 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        double withdrawal = 200;

        System.out.println(addCash(balances, ownerNames, ownerName, withdrawal));
    }

    static String addCash(int[] balanses, String[] ownerNames, String ownerName, double withdrawal) {
        int numberOfPerson = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                numberOfPerson = i;
                break;
            }
        }

        balanses[numberOfPerson] += withdrawal;
        return ownerName + " " + (int) balanses[numberOfPerson];
    }
}
