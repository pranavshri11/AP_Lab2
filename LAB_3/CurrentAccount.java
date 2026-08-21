class CurrentAccount extends BankAccount {
    private double overdraftLimit = 1000.0;

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public void withdraw(double amt) {
        if (amt <= 0) {
            System.out.println("error:enter positive amount");
            
        } else if (amt > balance + overdraftLimit) {
            System.out.println("error:withdrawal overdraftLimit");
            
        } else {
            balance -= amt;
            System.out.println("withdrawal successful");
        }
    }
}