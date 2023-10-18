public class BankAccount {
    // MEMBER VARIABLES
    private String name;
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    public BankAccount(String name){
        this.name = name;
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        accounts ++;
    }

    public BankAccount(String name, double checkingBalance, double savingsBalance) {
        this.name = name;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts ++;
        totalMoney += checkingBalance + savingsBalance;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public static int getAccounts(){
        return accounts;
    }
    
    public static double getTotalMoney(){
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositMoney(String accountType, double deposit) {
        if(accountType.equals("checking")){
            this.checkingBalance += deposit;
            totalMoney += deposit;
            System.out.println(String.format("Deposited %f in %s's %s account. Balance: $%f", deposit, this.name, accountType, this.checkingBalance));
        }
        else if(accountType.equals("savings")){
            this.savingsBalance += deposit;
            totalMoney += deposit;
            System.out.println(String.format("Deposited %f in %s's %s account. Balance: $%f", deposit, this.name, accountType, this.savingsBalance));
        }
        else{
            System.out.println("Error: incorrect account type.");
        }
    }

    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    public void withdrawMoney(String accountType, double withdrawal) {
        if(accountType.equals("checking")){
            if(this.checkingBalance < withdrawal){
                System.out.println(String.format("Withdrawal amount: $%f from %s's %s account. Insufficient Funds", withdrawal, this.name, accountType));
            }
            else{
                this.checkingBalance -= withdrawal;
                totalMoney -= withdrawal;
                System.out.println(String.format("Withdrawing $%f from %s's %s account. Checking balance: $%f", withdrawal, this.name, accountType, this.checkingBalance));
            }
        }
        else if(accountType.equals("savings")){
            if(this.savingsBalance < withdrawal){
                System.out.println(String.format("Withdrawal amount: $%f from %s's %s account. Insufficient Funds", withdrawal, this.name, accountType));
            }
            else{
                this.savingsBalance -= withdrawal;
                totalMoney -= withdrawal;
                System.out.println(String.format("Withdrawing $%f from %s's %s account. Savings balance: $%f", withdrawal, this.name, accountType, this.savingsBalance));
            }
        }
    }

    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance(){
        return (this.checkingBalance + this.savingsBalance);
    }
    // generate random ten digit string, apply to account number
}
