package homework_24.task_2;

public interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
    void transferMoney(PaymentSystem system, double amount);

}
