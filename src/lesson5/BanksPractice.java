package lesson5;

import java.util.Arrays;

public class BanksPractice {
    // пример с банковскими счетами:
    // - найти клиентов с балансом больше n
    // - найти клиентов с отрицательным балансом
    // - пополнение баланса (с комиссией)
    //   <= 100 2%
    //   > 100 1%
    // - снятие баланса

    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));

        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));

        depositMoney(names, balances, "Ann", 1000);
        System.out.println(Arrays.toString(balances));
    }

    public static String[] findClientsByBalance(String[] clients, int[] balances, int n) {
        // - найти клиентов с балансом больше n
       // String[] results = new String[clients.length]; // case 1: bad solution. Can be used if we don't know massive lenght

        // case 2: better solution:
        // шаг1: находим к-во результатов
        int count = 0;
        for (int balance : balances) {
            if (balance >= n)
                count++;
        }

        // шаг2: создаем массив с длинною результатов
        String[] results = new String[count];

        // шаг3: записываем результаты
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance >= n) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return results;
    }

    // - найти клиентов с отрицательным балансом
    public static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {
        // - найти клиентов с балансом больше n
        // шаг1: находим к-во результатов
        int count = 0;
        for (int balance : balances) {
            if (balance < 0)
                count++;
        }

        // шаг2: создаем массив с длинною результатов
        String[] results = new String[count];

        // шаг3: записываем результаты
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance < 0) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return results;
    }

    public static void depositMoney(String[] clients, int[] balances, String client, int money) {
//        //1. найти клиента в базе (в нашем случае в массивах)
//        // rule - names in massive shouldn't be repeated
//        int clientIndex = 0;
//        for (String cl : clients) {
//            if (cl == client) {
//                break;
//            }
//            clientIndex++;
//        }
        // the code which is commented at up is changed to call method which can be reusable
        // int clientIndex = findClientIndexByName(clients, client);

        //2. считаем сумму пополнения с учетом комиссии
        //int moneyToDeposit = money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
        // the code which is commented at up is changed to call method which can be reusable
        //int moneyToDeposit = calculateDepositAmountAfterCommission(money);

        //3. обновляем баланс (пополняем)
        // balances[clientIndex] += moneyToDeposit;
        // is improved
        balances[findClientIndexByName(clients, client)] += calculateDepositAmountAfterCommission(money);
    }

    //improve code which can be reusable in future
    static int findClientIndexByName(String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }

    static int calculateDepositAmountAfterCommission(int money) {
        return money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
    }

}
