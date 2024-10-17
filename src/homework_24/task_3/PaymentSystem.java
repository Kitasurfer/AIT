package homework_24.task_3;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 16-10-2024
*/

/*

 */




import java.math.BigDecimal;

public interface PaymentSystem {
    void withdrawMoney(BigDecimal amount);
    void depositTransfer(BigDecimal amount);
    BigDecimal checkBalance();
    void transferMoney(PaymentSystem to, BigDecimal amount);
    Currency getCurrency();
    BigDecimal getExchangeRateToEuro(); // Метод для получения курса обмена к евро
}
