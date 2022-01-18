package service;

import java.time.LocalDate;

public class Transaction {
    private  int id;
    private LocalDate dateTransfer;
    private String bankName;
    private long accountNumber;
    private long transferMoney;
    private String description;

    public Transaction(int id, LocalDate dateTransfer, String bankName, long accountNumber, long transferMoney, String description) {
        this.id = id;
        this.dateTransfer = dateTransfer;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.transferMoney = transferMoney;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateTransfer() {
        return dateTransfer;
    }

    public void setDateTransfer(LocalDate dateTransfer) {
        this.dateTransfer = dateTransfer;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getTransferMoney() {
        return transferMoney;
    }

    public void setTransferMoney(long transferMoney) {
        this.transferMoney = transferMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", dateTransfer=" + dateTransfer +
                ", bankName='" + bankName + '\'' +
                ", accountNumber=" + accountNumber +
                ", transferMoney=" + transferMoney +
                ", description='" + description + '\'' +
                '}';
    }
}
