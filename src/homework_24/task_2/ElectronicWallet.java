package homework_24.task_2;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 15-10-2024
*/

/*

 */
public class ElectronicWallet implements PaymentSystem{
    private double balance;
    private Currency currency;

    public ElectronicWallet(double balance, Currency currency) {
        this.balance = balance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (this.balance >= amount){
            this.balance -= amount;
            System.out.println("Снятие: " + amount);
            System.out.println("Остаток: " + this.balance);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        this.balance += amount;
        System.out.println("Пополнение: " + amount);
        System.out.println("Остаток: " + this.balance);

    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void transferMoney(PaymentSystem system, double amount) {
        withdrawMoney(amount);
    }

    public Currency getCurrency() {
        return currency;
    }
}
