package service;

import model.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountService {

    public ArrayList<BankAccount> getAllBankAccount(){
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(941757062,"thuha123",5000000));
        return accounts;
    }

    public void show(ArrayList<BankAccount> accounts){
        for (BankAccount p: accounts){
            System.out.println(p);
        }
    }

    public void checkMoney(ArrayList<BankAccount> accounts){
        for (BankAccount p: accounts){
            System.out.println("Số tiền trong tài khoản là:");
            System.out.println(p.getMoney());
        }
    }

    public ArrayList<BankAccount> transaction(ArrayList<BankAccount> accounts){
        String bank = "VPBank";
        Scanner sc = new Scanner(System.in);

        int receiverLength = 0;
        while (8<= receiverLength <=16){
            System.out.println("Nhập số tài khoản");
            long receiver = Long.parseLong(sc.nextLine());
            int receiverLength = 0;
            if()
        }




    }
}
