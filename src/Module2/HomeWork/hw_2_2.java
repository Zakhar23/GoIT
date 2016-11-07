/*
*hw_2_2
*
*version 1.0
*
*created by Zakhar
*/

package Module2.HomeWork;

public class hw_2_2 {

    public static void main(String[] args) {

        double balance = 1000.25;
        double Cash = 1000.05;

        GetCash(balance, Cash);
    }


    static void GetCash(double balance, double sum) {

        double commissions = sum * 0.05;

        if (sum + commissions < balance)
            System.out.println("Успешно! Операция на сумму " + (sum + commissions) + " грн. Остаток: " + (balance - (sum + commissions)));
        else
            System.out.println("Операция отклонена, не достаточный баланс!");

    }
}

