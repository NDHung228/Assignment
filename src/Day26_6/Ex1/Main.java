package Day26_6.Ex1;

import Day26_6.Ex1.model.Account;
import Day26_6.Ex1.model.CurrentAccount;
import Day26_6.Ex1.model.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Init object
        List<Account> listAccounts = new ArrayList<Account>();

        // add saving account to bank
        System.out.println("Savings Account: ");
        SavingAccount savingAccount = new SavingAccount(1000.00  ,1.25);
        listAccounts.add(savingAccount);


        // add current account to bank
        System.out.println("\nCurrent Account:");
        CurrentAccount currentAccount = new CurrentAccount(5000.00);
        listAccounts.add(currentAccount);

        // deposit
        System.out.println();
        savingAccount.sendMoney(100);
        currentAccount.sendMoney(500);
        savingAccount.withdrawMoney(150);

        //print balance
        System.out.println("\nSavings A/c and Current A/c:");
        savingAccount.checkAccountBalance();
        currentAccount.checkAccountBalance();

        //saving for 1 years
        System.out.println("\nAfter applying interest on Savings A/c for 1 year:");
        savingAccount.calculateInterest();
        currentAccount.calculateInterest();

        // show all account
        System.out.println("\nShow all account in bank");
        for (Account account : listAccounts) {
            System.out.println(account.toString());
        }
    }
}
