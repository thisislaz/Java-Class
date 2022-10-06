import java.util.ArrayList;
import java.util.Random;

public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;

    private static int accountsCreatedThusFar;
    private static double totalAmountInAccounts;


// ------------- Constructors ----------------
    public BankAccount(){
        accountsCreatedThusFar++;
        this.accountNumber = generateRandomAccountNumber();
    }

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accountsCreatedThusFar++;
        totalAmountInAccounts += checkingBalance + savingsBalance;
        this.accountNumber = generateRandomAccountNumber();
        
    }
//-------------- methods ----------------------

    public void displayTotal(){
        System.out.println("==========================================");
        System.out.println("Checking Balance: " + this.checkingBalance);
        System.out.println("Savings Balance: " + this.savingsBalance);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("========================================== \n");
    }

    public void depositMoney(double checkingBalance, double savingsBalance){
        this.checkingBalance += checkingBalance;
        this.savingsBalance += savingsBalance;
        totalAmountInAccounts += checkingBalance + savingsBalance;
    }

    public void withdrawAmountSavings(double amount){
        if(this.savingsBalance < amount){
            System.out.println("Insufficient funds \n");
        } else{
        this.savingsBalance -= amount;
        totalAmountInAccounts -= amount;
        }
    }

    public void withdrawAmountChecking(double amount){
        if(this.checkingBalance < amount){
            System.out.println("Insufficient funds \n");
        } else{
        this.checkingBalance -= amount;
        totalAmountInAccounts -= amount;
        }
    }

    private long generateRandomAccountNumber(){
        Random randomAccountNumber = new Random();
        long accountId = 100000000 + randomAccountNumber.nextInt(1000000000-100000000);
        return accountId;
    }

// --------------------     getters         ------------------------
   
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public static int getAccountsCreatedThusFAr(){
        return accountsCreatedThusFar;
    }

    public static double getTotalAmountInAccounts(){
        return totalAmountInAccounts;
    }

// --------------------     setters         ------------------------

    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    
}