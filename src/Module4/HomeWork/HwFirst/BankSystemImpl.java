package Module4.HomeWork.HwFirst;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        int comission = amount / 100 * user.getBank().getCommission(amount);
        if (user.getBalance() >= amount + comission && amount + comission < user.getBank().getLimitOfWithdrawal()) {
            user.setBalance(user.getBalance() - (amount + comission));
            user.getBank().setTotalCapital(user.getBank().getTotalCapital() + comission);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfFunding()) {
            user.setBalance(user.getBalance() + amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        int comission = amount / 100 * fromUser.getBank().getCommission(amount);
        if (fromUser.getBalance() >= amount + comission
                && amount + comission < fromUser.getBank().getLimitOfWithdrawal()
                && amount <= toUser.getBank().getLimitOfFunding()) {
            fromUser.setBalance(fromUser.getBalance() - (amount + comission));
            fromUser.getBank().setTotalCapital(fromUser.getBank().getTotalCapital() + comission);
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }


}
