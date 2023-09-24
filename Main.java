package abstractclass;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("Сберегательный счет", 1000);
        CreditAccount creditAccount = new CreditAccount("Кредитный счет");
        CheckingAccount checkingAccount = new CheckingAccount("Расчетный счет", 800);

        creditAccount.pay(500);
        creditAccount.addMoney(300);
        savingAccount.transfer(checkingAccount, 150);
        checkingAccount.pay(400);


    }
}
