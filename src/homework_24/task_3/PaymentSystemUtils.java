package homework_24.task_3;

import java.math.BigDecimal;

public class PaymentSystemUtils {

    // Метод для вычисления общего баланса с конвертацией в евро
    public static BigDecimal getTotalBalanceInEuro(PaymentSystem[] paymentSystems) {
        BigDecimal totalBalance = BigDecimal.ZERO;

        for (PaymentSystem system : paymentSystems) {
            // Конвертация баланса в евро
            BigDecimal balanceInEuro = system.checkBalance().multiply(system.getExchangeRateToEuro());
            totalBalance = totalBalance.add(balanceInEuro);
        }

        return totalBalance;
    }
}
