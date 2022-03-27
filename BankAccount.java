public class BankAccount {

    // Create instances
    private double checkingBalance;
    private double savingBalance;

    // Create statics
    public static int numberOfAccounts = 0;
    public static double amountOfMoney = 0;
        
    public BankAccount() {
        BankAccount.numberOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingBalance = 0;
    }

    // getter
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingBalanvce() {
        return this.savingBalance;
    }

    public void depositMoney(double amount, String accountType) {

        // Need to know which account
        if (accountType == "checking") {
            this.checkingBalance += amount;
        } 
        else {
            // increment the balance
            this.savingBalance += amount;
        }

        // increment the total 
        this.amountOfMoney += amount;

    }

    public void withdrawMoney(double amount, String accountType) {
        // Need to know which account
        if (accountType == "checking") {
            if(amount > this.checkingBalance) {
                System.out.println("Insufficient Funds");
            }
            this.checkingBalance -= amount;
        } 
        else {
            // increment the balance
            if(amount > this.savingBalance) {
                System.out.println("Insufficient Funds");
            }
            this.savingBalance -= amount;
        }

        // increment the total 
        this.amountOfMoney -= amount;
    }
    
}
