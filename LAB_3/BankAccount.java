import java.util.*; 

abstract class BankAccount { 
    protected String accNo; 
    protected double balance; 
    public BankAccount(String accNo, double balance) { 
        this.accNo = accNo; 
        this.balance = balance; 
    } 
    public abstract void withdraw(double amt); 
    public double getBalance() { 
        return balance; 
    } 
} 
// TODO: Implement SavingsAccount and CurrentAccount child extensions here
