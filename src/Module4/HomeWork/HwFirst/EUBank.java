package Module4.HomeWork.HwFirst;

import Module4.HomeWork.HwSecond.Currency;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.EUR) {
            return 2200;
        } else if (this.getCurrency() == Currency.USD) {
            return 2000;
        } else {
            return 0;
        }
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission(int summ) {
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return super.moneyPaidMonthlyForSalary();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public String getBankCountry() {
        return super.getBankCountry();
    }

    @Override
    public void setBankCountry(String bankCountry) {
        super.setBankCountry(bankCountry);
    }

    @Override
    public Currency getCurrency() {
        return super.getCurrency();
    }

    @Override
    public void setCurrency(Currency currency) {
        super.setCurrency(currency);
    }

    @Override
    public int getNumberOfEmployees() {
        return super.getNumberOfEmployees();
    }

    @Override
    public void setNumberOfEmployees(int numberOfEmployees) {
        super.setNumberOfEmployees(numberOfEmployees);
    }

    @Override
    public double getAvrSalaryOfEmployee() {
        return super.getAvrSalaryOfEmployee();
    }

    @Override
    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        super.setAvrSalaryOfEmployee(avrSalaryOfEmployee);
    }

    @Override
    public long getRating() {
        return super.getRating();
    }

    @Override
    public void setRating(long rating) {
        super.setRating(rating);
    }

    @Override
    public long getTotalCapital() {
        return super.getTotalCapital();
    }

    @Override
    public void setTotalCapital(long totalCapital) {
        super.setTotalCapital(totalCapital);
    }
}
