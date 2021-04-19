package lesson12;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        //limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
        if (getCurrency() == Currency.USD)
            return 2000;
        return 2200;
    }

    @Override
    public int getLimitOfFunding() {
        //limit of funding - 20000 if EUR and 10000 if USD
        if (getCurrency() == Currency.EUR)
            return 20000;
        return 10000;
    }

    @Override
    public double getMonthlyRate() {
        //monthly rate - 0% with USD and 1% with EUR
        if (getCurrency() == Currency.USD)
            return 0.00;
        return 0.01;
    }

    @Override
    public double getCommission(int amount) {
        //commision - 5% if USD and up to 1000, 7% if USD and more than 1000
        //2% if EUR and up to 1000 and 4% if EUR and more than 1000

        if (getCurrency() == Currency.USD) {
            if (amount <= 1000)
                return 0.05;
            else
                return 0.07;
        } else {
            if (amount <= 1000)
                return 0.02;
            else
                return 0.04;
        }
    }
}
