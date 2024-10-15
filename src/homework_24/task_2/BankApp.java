package homework_24.task_2;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 15-10-2024
*/

/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.

Опционально
Добавить в интерфейс метод:

transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */
public class BankApp {
    public static void main(String[] args) {
        PaymentSystem bank = new BankAccount(10000.00, Currency.EURO);
        PaymentSystem wallet = new ElectronicWallet(5000.00, Currency.USD);


        System.out.println(wallet.checkBalance());
        System.out.println("###");
        bank.transferMoney(wallet,  5000.00);
        System.out.println(wallet.checkBalance());
        System.out.println("###");
        System.out.println(bank.checkBalance());
        wallet.transferMoney(bank, 12000);
        System.out.println(bank.checkBalance());
    }


}
