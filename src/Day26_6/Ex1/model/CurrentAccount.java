package Day26_6.Ex1.model;

import Day26_6.Ex1.services.AccountServices;


public class CurrentAccount extends Account implements AccountServices {

    public CurrentAccount(double balance) {
        this.balance = balance;
        System.out.println("Initial Deposit: $" + this.balance);
        System.out.println("OverdraftLimit: $1000");
    }

    @Override
    public void sendMoney(double amount) {
        System.out.println("New deposit $" + amount + " to Current Account");
        balance = balance + amount;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 1000) {
            System.out.println("OverdraftLimit: $1000");
            return;
        } else if(balance - amount < 0) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        System.out.println("New balance after withdraw money: " + balance);
    }

    @Override
    public void calculateInterest() {
        checkAccountBalance();
    }

    @Override
    public void checkAccountBalance() {
        System.out.println("Account balance: "+balance);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "balance=" + balance +
                '}';
    }
}
