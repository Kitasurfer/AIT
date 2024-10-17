package homework_24.task_3;

import java.math.BigDecimal;

public class BankAccount implements PaymentSystem {
    private BigDecimal balance;
    private Currency currency;

    public BankAccount(BigDecimal initialBalance, Currency currency) {
        this.balance = initialBalance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(BigDecimal amount) {
        if (amount.compareTo(balance) <= 0) {
            balance = balance.subtract(amount);
            System.out.println("Снято со счета банка: " + amount + " " + currency);
        } else {
            System.out.println("Недостаточно средств на банковском счете.");
        }
    }

    @Override
    public void depositTransfer(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Поступление на банковский счет: " + amount + " " + currency);
    }

    @Override
    public BigDecimal checkBalance() {
        return balance;
    }

    @Override
    public void transferMoney(PaymentSystem to, BigDecimal amount) {
        if (amount.compareTo(balance) <= 0) {
            withdrawMoney(amount);
            to.depositTransfer(amount);
            System.out.println("Перевод " + amount + " " + currency + " на другой счет.");
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public BigDecimal getExchangeRateToEuro() {
        return switch (currency) {
            case USD -> new BigDecimal("0.83");   // Пример: 1 доллар = 0.83 евро
            case UAH -> new BigDecimal("0.025");  // Пример: 1 гривна = 0.025 евро
            case EURO -> BigDecimal.ONE;          // Курс для евро (1 к 1)
        };
    }
}
