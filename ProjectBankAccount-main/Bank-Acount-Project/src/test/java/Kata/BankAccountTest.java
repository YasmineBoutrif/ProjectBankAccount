package Kata;

import Kata.BankAccount;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testDepositAndWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(1000, LocalDate.of(2025, 8, 1));
        account.withdraw(200, LocalDate.of(2025, 8, 2));
        account.deposit(500, LocalDate.of(2025, 8, 3));

        assertDoesNotThrow(() -> account.printStatement());
    }
}
