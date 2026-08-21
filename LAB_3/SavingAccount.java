class SavingsAccount extends BankAccount {

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public void withdraw(double amt) {
        if (amt <= 0) {
            System.out.println("error:enter positive amount");
        } else if (amt > balance) {
            System.out.println("error: insufficient balance");
        } else {
            balance -= amt;
            System.out.println("withdrawal successful");
        }
    }
}