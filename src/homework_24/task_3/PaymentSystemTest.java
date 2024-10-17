package homework_24.task_3;

import java.math.BigDecimal;

public class PaymentSystemTest {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(new BigDecimal("1000"), Currency.EURO); // Баланс в евро
        BankAccount bankAccount2 = new BankAccount(new BigDecimal("500"), Currency.USD);   // Баланс в долларах
        ElectronicWallet walletUAH = new ElectronicWallet(new BigDecimal("50000"), new BigDecimal("0.025"), Currency.UAH); // Баланс в гривнах

        // Проверка баланса
        System.out.println("Баланс банка 1: " + bankAccount1.checkBalance() + " евро");
        System.out.println("Баланс банка 2: " + bankAccount2.checkBalance() + " долларов");
        System.out.println("Баланс кошелька: " + walletUAH.checkBalance() + " гривен");

        // Вычисление общего баланса в евро
        PaymentSystem[] systems = {bankAccount1, bankAccount2, walletUAH};
        BigDecimal totalBalanceInEuro = PaymentSystemUtils.getTotalBalanceInEuro(systems);

        // Вывод общего баланса в евро
        System.out.println("Общий баланс всех счетов в евро: " + totalBalanceInEuro);
    }
}
