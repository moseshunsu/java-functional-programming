package org.higherAchievers.lambda.realWorldBankTransferExample;

public interface AccountFactory {
    BankAccount getBankAccount (int id, double balance, String accountName);
}
