package homework_24.task_2;/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 15-10-2024
*/

public class BankAccount implements PaymentSystem {
    private double balance;
    private Currency currency;

    public BankAccount(double balance, Currency currency) {
        this.balance = balance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (this.balance >= amount) {  // Исправлено условие
            this.balance -= amount;
            System.out.println("Снятие: " + amount + " " + this.currency);
            System.out.println("Остаток: " + this.balance + " " + this.currency);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        this.balance += amount;
        System.out.println("Пополнение: " + amount + " " + this.currency);
        System.out.println("Остаток: " + this.balance + " " + this.currency);
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void transferMoney(PaymentSystem system, double amount) {
        if (system instanceof BankAccount) {
            // Перевод между банковскими счетами в одной валюте
            if (this.currency == ((BankAccount) system).getCurrency()) {
                withdrawMoney(amount);
                system.depositTransfer(amount);
                System.out.println("Перевод между банковскими счетами на " + amount + " " + this.currency);
            } else {
                System.out.println("Невозможно перевести средства между разными валютами без конвертации");
            }
        } else if (system instanceof ElectronicWallet) {
            // Перевод между банком и электронным кошельком с конвертацией валют
            Currency walletCurrency = ((ElectronicWallet) system).getCurrency();
            double exchangedAmount = exchange(walletCurrency, amount);
            if (this.balance >= exchangedAmount) {
                withdrawMoney(exchangedAmount); // Списываем конвертированную сумму
                system.depositTransfer(amount); // Зачисляем в кошелек исходную сумму
                System.out.println("Перевод на кошелек: " + amount + " " + walletCurrency);
            } else {
                System.out.println("Недостаточно средств для перевода");
            }
        }
    }

    public Currency getCurrency() {
        return currency;
    }

    // Метод обмена валют
    public double exchange(Currency targetCurrency, double amount) {
        return switch (targetCurrency) {
            case USD -> amount / 1.2;  // Конвертация в доллары
            case EURO -> amount;       // Евро не требует конвертации
        };
    }
}
