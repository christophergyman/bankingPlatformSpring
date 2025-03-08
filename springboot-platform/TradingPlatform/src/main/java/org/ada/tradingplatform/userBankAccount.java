package org.ada.tradingplatform;
import java.time.LocalDateTime;

public class userBankAccount {
    private long bankID;
    private long accountNumber;
    private long routingNumber;
    private int branchId;
    private double balance;
    private LocalDateTime openingDate;
    private LocalDateTime closingDate;
    private enum balanceState{OPEN, CLOSED, PAUSED};
    private enum accountTier{TRIAL, BRONZE, GOLD};

// account_tier

}
