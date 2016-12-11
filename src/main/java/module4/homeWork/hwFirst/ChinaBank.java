package module4.homeWork.hwFirst;

public class ChinaBank extends Bank {
    public ChinaBank(String name, long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(name, id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.EUR) {
            return 150;
        } else if (this.getCurrency() == Currency.USD) {
            return 100;
        } else {
            return 0;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) {
            return 5000;
        } else if (this.getCurrency() == Currency.USD) {
            return 1000;
        } else {
            return 0;
        }
    }

    @Override
    int getMonthlyRate() {
        if (this.getCurrency() == Currency.EUR) {
            return 0;
        } else if (this.getCurrency() == Currency.USD) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    int getCommission(int summ) {
        if (this.getCurrency() == Currency.EUR) {
            if (summ < 1000) {
                return 10;
            }
            return 11;
        } else if (this.getCurrency() == Currency.USD) {
            if (summ < 1000) {
                return 3;
            }
            return 5;
        } else {
            return 0;
        }
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
