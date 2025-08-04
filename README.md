# Bank Account Kata

## Objectif

Permettre à un client de banque de :
- faire un dépôt
- faire un retrait
- imprimer son relevé de compte (date, montant, solde)

## Exemple d'utilisation

```java
BankAccount account = new BankAccount();
account.deposit(1000, LocalDate.of(2025, 8, 1));
account.withdraw(200, LocalDate.of(2025, 8, 2));
account.deposit(500, LocalDate.of(2025, 8, 3));
account.printStatement();