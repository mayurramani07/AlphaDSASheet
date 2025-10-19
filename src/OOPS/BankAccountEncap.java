package OOPS;
import java.util.*;
public class BankAccountEncap {
    private double balance;  //instance variable

    public BankAccountEncap(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.print("Invalid Balance");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid Withdraw");
        }
    }
    public void AddBalance(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    public static void main(String[] args) {
        BankAccountEncap account = new BankAccountEncap(1000);
        System.out.println(account.getBalance());
        account.withdraw(1000);
        System.out.println(account.getBalance());
    }
}
