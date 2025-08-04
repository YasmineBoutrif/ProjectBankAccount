package Kata;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final List<Transaction> transactions = new ArrayList<>();
    private int balance = 0;

    public void deposit(int amount, LocalDate date) {
        balance += amount;
        transactions.add(new Transaction(date, amount, balance));
    }

    public void withdraw(int amount, LocalDate date) {
        balance -= amount;
        transactions.add(new Transaction(date, -amount, balance));
    }

    public void printStatement() {
        StatementPrinter.print(transactions);
    }
}
