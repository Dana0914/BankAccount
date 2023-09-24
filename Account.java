package abstractclass;

public abstract class Account {
    private String name;
    protected int balance;
    Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(String name) {
    }

    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("Balance can not be negative");
        }
        this.balance = balance;
    }

    abstract void pay(int amount);

    abstract void transfer(Account account, int amount);

    abstract void addMoney(int amount);
}
