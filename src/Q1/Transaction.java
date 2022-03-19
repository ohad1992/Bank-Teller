package Q1;

public class Transaction {

    private int account_num;
    private double amount;


    public Transaction(int account_num, double amount) {
        this.account_num = account_num;
        this.amount = amount;
    }

    public int getAccount_num() {
        return account_num;
    }

    public double getAmount() {
        return amount;
    }

    public void setAccount_num(int account_num) {
        this.account_num = account_num;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
