package lesson12;

public class Main {
    public static void main(String[] args) {
        Bank euBank = new EUBank(1222, "Sweden", Currency.EUR, 100, 1400, 4, 444343434);
        User user = new User(1001, "Denis", 12200, 40, "GMD", 1500, euBank);
        User user2 = new User(1002, "Anton", 15600, 60, "GMD", 1500, euBank);

        Bank usBank = new USBank(1333, "New York", Currency.USD, 50, 850, 2, 222171717);
        User user3 = new User(1003, "Andrew", 4300, 12, "USB", 1000, usBank);
        User user4 = new User(1004, "David", 5000, 6, "USB", 700, usBank);

        Bank chinaBank = new ChinaBank(1444, "Beijing", Currency.EUR, 2500, 2000, 5, 992171717);
        User user5 = new User(1005, "Jackie", 27000, 63, "CNB", 3000, chinaBank);
        User user6 = new User(1006, "Lin", 21000, 55, "CNB", 2500, chinaBank);

        BankSystem bankSystem = new UkrainianBankSystem();
        bankSystem.withdraw(user, 150);

        System.out.println(user.getBalance());

        bankSystem.fund(user, 150);
        System.out.println(user.getBalance());

        bankSystem.fund(user3, 1000);
        System.out.println(user3.getBalance());

        bankSystem.fund(user4, 10001);
        System.out.println(user4.getBalance());

        bankSystem.fund(user5, 4999);
        System.out.println(user5.getBalance());

        bankSystem.fund(user6, 5000);
        System.out.println(user5.getBalance());

        bankSystem.transferMoney(user, user2, 100);
        System.out.println(user.getBalance());
        System.out.println(user2.getBalance());

        bankSystem.transferMoney(user3, user4, 100);
        System.out.println(user3.getBalance());
        System.out.println(user4.getBalance());

        bankSystem.transferMoney(user3, user6, 100);
        System.out.println(user3.getBalance());
        System.out.println(user6.getBalance());

        bankSystem.paySalary(user5);
        System.out.println(user5.getBalance());

        bankSystem.paySalary(user2);
        System.out.println(user2.getBalance());
    }
}
