import java.util.ArrayList;
import java.util.Random;

public class BankAccountTest{
    public static void main(String[] args){
        System.out.print("--------- BankAccounts Test ------------- \n");
        BankAccount newAcc1 = new BankAccount(500.00, 100.50);
        BankAccount newAcc2 = new BankAccount(100,1000.20);
        BankAccount newAcc3 = new BankAccount();
        BankAccount newAcc4 = new BankAccount(150.00, 0);    

        newAcc2.withdrawAmountSavings(250.7);

        newAcc1.displayTotal();
        newAcc2.displayTotal();
        
        newAcc2.withdrawAmountSavings(500);
        newAcc4.displayTotal();

        newAcc3.depositMoney(100, 250);
        newAcc3.displayTotal();
        
        System.out.println("Total in Accounts in Bank: " + BankAccount.getAccountsCreatedThusFAr());
        System.out.println("Total Amount in Bank: " + BankAccount.getTotalAmountInAccounts());
    }
}