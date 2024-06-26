package Day26_6.Ex1.services;

public interface AccountServices {
    void sendMoney(double amount);
    void withdrawMoney(double amount);
    void calculateInterest();
    void checkAccountBalance();
}
