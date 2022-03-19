package Q1;

public class Account {

    private int account_num;
    private double balance;


    public Account(int account_num, int balance) {
        this.account_num = account_num;
        this.balance = balance;
    }

    public synchronized void transaction(double amount) {
        while(balance + amount < 0) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        balance = balance + amount;
        System.out.println("Banker added " + amount + " dollars to account no. "
                + account_num + ". New balance is " + balance);
        notifyAll();
    }

    public double getBalance() {
        return balance;
    }
}
