package abstractclass;

public class CreditAccount extends Account {
    CreditAccount(String name) {
        super(name, 0);
    }

    @Override
    void pay(int amount) {
        if (amount > 0  || balance < 0) {
            balance -= amount;
            System.out.printf("Платеж совершен успешно, остаток на счете равен на сумму %d" + "\n", balance);
        } else {
            System.out.println("Ошибка");

        }

    }

    @Override
    void transfer(Account account, int amount) {
        System.out.println("Операция запрещена");
    }

    @Override
    void addMoney(int amount) {
        if (amount + balance <= 0) {
            balance += amount;
            System.out.printf("Счет пополнен успешно на сумму %d, текущий счет равен на сумму %d" + "\n", amount, balance);
        } else {
            System.out.println("Ошибка: Кредитный счет не может иметь положительный баланс.");
        }
    }
}
