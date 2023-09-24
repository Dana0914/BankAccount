package abstractclass;

public class CheckingAccount extends Account {
    CheckingAccount(String name, int balance) {
        super(name, balance);
    }
    @Override
    void pay(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.printf("Счет оплачен на сумму %d, остаток на счете равен на сумму %d" + "\n",amount, balance);
        } else if (amount > balance) {
            System.out.println("Не достаточно средств чтобы оплатить");
        } else {
            System.out.println("Ошибка");
        }
    }

    @Override
    void transfer(Account account, int amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            account.balance += amount;
            System.out.printf("Перевод совершен на %s успешно на сумму %d, остаток на счете равен на сумму %d"
                    + "\n", account.getName(), amount, balance);
        } else if (amount > balance) {
            System.out.println("Не достаточно средств чтобы совершить перевод");
        } else {
            System.out.println("Ошибка");
        }
    }

    @Override
    void addMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Счет пополнен успешно на сумму %d, текущий счет равен на сумму %d" + "\n", amount, balance);
        } else {
            System.out.println("Ошибка");
        }
    }
}
