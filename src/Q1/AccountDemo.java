package Q1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class AccountDemo {
    public static void main(String[] args) {

        HashMap<Integer, Account> accounts = new HashMap<>();
        // initilize 4 accounts with account num from 0-5 and balance=0
        for (int i = 0; i < 5; i++) {
            Account a = new Account(i, 0);
            accounts.put(i, a);
        }

        ArrayList<Transaction> transactions = new ArrayList<>();
        // create resource of movements with random numbers for deposit and withdraw
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++)
                transactions.add(new Transaction(i, new Random().nextInt(500) - 300));
        }
        Transactions t = new Transactions(transactions);

        BankAdminstration[] admins = new BankAdminstration[10];
        // create 10 procceses
        for (BankAdminstration admin : admins) {
            admin = new BankAdminstration(t, accounts);
            admin.start();
        }
    }
}



