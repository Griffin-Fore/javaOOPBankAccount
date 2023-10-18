public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount("Josh");
        BankAccount account2 = new BankAccount("Laura", 12.50, 14.00);
        BankAccount account3 = new BankAccount("Javier");
        BankAccount account4 = new BankAccount("Havier", 500.00, 500.00);
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.depositMoney("checking", 500.00); 
        account2.depositMoney("savings", 300.00);
        account3.depositMoney("checking", 700.00);
        account4.depositMoney("savings", 9000.00);
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        account1.withdrawMoney("checking", 300);
        account2.withdrawMoney("savings",700.00);
        account2.withdrawMoney("checking", 1.00);
        account3.withdrawMoney("checking", 600.00);
        account4.withdrawMoney("savings",10000.00);
        account4.withdrawMoney("savings", 9000.00);
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(account1.getCheckingBalance());
        System.out.println("Account 1 balance: $" + account1.getBalance());
        System.out.println("Account 2 balance: $" + account2.getBalance());
        System.out.println("Account 3 balance: $" + account3.getBalance());
        System.out.println("Account 4 balance: $" + account4.getBalance());
        System.out.println("Total number of accounts: " + BankAccount.getAccounts());
        System.out.println("Total money in all accounts: " + BankAccount.getTotalMoney());
    }
}

