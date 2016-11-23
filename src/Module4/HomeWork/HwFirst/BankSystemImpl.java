package Module4.HomeWork.HwFirst;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBalance() >= amount && amount < user.getBank().getLimitOfWithdrawal()) {
            user.setBalance(user.getBalance() - amount);
        }
    }

    @Override
    public void fundUser(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }
}
