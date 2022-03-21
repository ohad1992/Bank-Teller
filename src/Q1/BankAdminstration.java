package Q1;

import Q1.Transaction;
import Q1.Transactions;

import java.util.HashMap;
import java.util.Random;

public class BankAdminstration extends Thread {
    private Transactions transactions;
    private HashMap<Integer, Account> accounts;

    public BankAdminstration(Transactions t, HashMap<Integer, Account> a) {
        transactions = t;
        accounts = a;
    }

    @Override
    public void run() {
        super.run();
        //get transaction
        Transaction t = transactions.getTransaction();
        //while transactions resource not null
        while(t != null) {
            // get account num
            Account a = accounts.get(t.getAccount_num());
            // deposit or withdraw 
            a.transaction(t.getAmount());
            try {
                sleep(new Random().nextInt(100));
            } catch (InterruptedException e) { }
            t = transactions.getTransaction();
        }
    }
}
