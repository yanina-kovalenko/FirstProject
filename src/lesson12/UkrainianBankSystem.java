package lesson12;

public class UkrainianBankSystem implements BankSystem {
    @Override
    public void withdraw(User user, int amount) {
        //проверить можно ли снять деньги -
        //проверить лимит
        //проверить достаточно ли денег
        //снять деньги

        if (!checkWithdraw(user, amount))
            return;

        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }

    @Override
    public void fund(User user, int amount) {
        //проверить можно ли пополнить деньги -
        //проверить лимит
        //проверить достаточно ли денег
        //пополнить деньги

        if (!checkFund(user, amount))
            return;

        user.setBalance(user.getBalance() + amount - amount * user.getBank().getCommission(amount));
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //снимаем деньги с fromUser
        //пополняем toUser

        if (!checkWithdraw(fromUser, amount) && !checkFund(toUser, amount))
            return;

        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));

        toUser.setBalance(toUser.getBalance() + amount - amount * toUser.getBank().getCommission(amount));
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getSalary() - user.getSalary() * user.getBank().getMonthlyRate());
    }
    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawlimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawlimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawlimits(User user, int amount, double limit) {
        if(amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private boolean checkFund(User user, int amount) {
        return checkFundlimits(user, amount, user.getBank().getLimitOfFunding()) &&
                checkFundlimits(user, amount, user.getBalance());
    }

    private boolean checkFundlimits(User user, int amount, double limit) {
        if(amount + user.getBank().getCommission(amount) > limit) {
            printFundingErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printFundingErrorMsg(int amount, User user) {
        System.err.println("Can't forward money " + amount + " to user " + user.toString());
    }
}