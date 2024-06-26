package Day26_6.Ex1.model;

import Day26_6.Ex1.services.AccountServices;


public class SavingAccount extends Account implements AccountServices {
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
        System.out.println("Initial Deposit: $" + this.balance);
        System.out.println("Interest rate: "+this.interestRate+"%");
    }

    @Override
    public void sendMoney(double amount) {
        balance += amount;
        System.out.println("New deposit $" + amount + " to Saving Account");
    }

    @Override
    public void withdrawMoney(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient Balance");
            return ;
        }
        balance -= amount;
        System.out.println("Withdraw $"+amount + " from Saving Account");
    }

    @Override
    public void calculateInterest() {
        balance += balance * interestRate/100;
        System.out.println("Account balance: " + balance + " in Saving Account");
    }

    @Override
    public void checkAccountBalance() {
        System.out.println("Account balance: " + balance + " in Saving Account");
        System.out.println("Interest rate: " + interestRate + " in Saving Account");
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", balance=" + balance +
                '}';
    }
}
