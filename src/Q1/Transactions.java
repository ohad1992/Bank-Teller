package Q1;

import java.util.ArrayList;

public class Transactions {

    ArrayList<Transaction> movement = new ArrayList<Transaction>();

    public Transactions(ArrayList<Transaction> movement) {
        this.movement = new ArrayList<>(movement);
    }

    public Transaction getTransaction() {
        if(movement.isEmpty())
            return null;
        return movement.remove(0);
    }
}
