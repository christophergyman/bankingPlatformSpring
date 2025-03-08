package org.ada.classes;
import java.time.LocalDateTime;

public class UserBankAccount {
    private long bankID;
    private long accountNumber;
    private long routingNumber;
    private int branchId;
    private double balance;
    private LocalDateTime openingDate;
    private LocalDateTime closingDate;
    private BalanceState balanceState;
    private AccountTier accountTier;

    public enum BalanceState{OPEN, CLOSED, PAUSED};
    public enum AccountTier{TRIAL, BRONZE, GOLD};

    // Admin Constructor
    public UserBankAccount(long bankID, long accountNumber, long routingNumber, int branchId, double balance,
                           LocalDateTime openingDate, LocalDateTime closingDate, BalanceState balanceState,
                           AccountTier accountTier) {

        this.bankID = bankID;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.branchId = branchId;
        this.balance = balance;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.balanceState = balanceState;
        this.accountTier = accountTier;

    }
    //setter
    public void setBalance(double balance){ this.balance = balance; }
    public void setAccountTier(AccountTier accountTier){ this.accountTier = accountTier; }

    //getter

    // Getters
    public long getBankID() { return bankID; }
    public long getAccountNumber() { return accountNumber; }
    public long getRoutingNumber() { return routingNumber; }
    public int getBranchId() { return branchId; }
    public double getBalance() { return balance; }
    public LocalDateTime getOpeningDate() { return openingDate; }
    public LocalDateTime getClosingDate() { return closingDate; }
    public BalanceState getBalanceState() { return balanceState; }
    public AccountTier getAccountTier() { return accountTier; }
}
