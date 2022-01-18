package model;

import service.Transaction;

import java.util.ArrayList;

public class TransactionService {

    public ArrayList<Transaction> getAllTransaction(){
        return new ArrayList<>();
    }

    public void show(ArrayList<Transaction> transactions){
        for (Transaction p:transactions){
            System.out.println(p);
        }
    }
}
