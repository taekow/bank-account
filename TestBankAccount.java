public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount user1BankAccount = new BankAccount();
        user1BankAccount.depositMoney(1000, "checking");
        user1BankAccount.depositMoney(500, "saving");
        user1BankAccount.withdrawMoney(300, "checking");
        user1BankAccount.withdrawMoney(200, "saving");

        BankAccount user2BankAccount = new BankAccount();
        user2BankAccount.depositMoney(450, "checking");
        user2BankAccount.depositMoney(1500, "Saving");
        user2BankAccount.withdrawMoney(500, "checking");
        user2BankAccount.withdrawMoney(500, "saving");

        System.out.println(user1BankAccount.getCheckingBalance());
        System.out.println(user1BankAccount.getSavingBalanvce());

        System.out.println(user2BankAccount.getCheckingBalance());
        System.out.println(user2BankAccount.getSavingBalanvce());

    }
}
