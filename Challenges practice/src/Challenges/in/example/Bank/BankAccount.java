package Challenges.in.example.Bank;

public class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void depositMoney(double addMoney){
        if (addMoney <= 0){
            System.out.println("!!!..Invalid Amount..!!!");
        }else {
            balance += addMoney;
            System.out.printf("Your money is successfully added of Amount %d%s", Math.round(addMoney) ," in your balance\n");
        }
    }
    public double withdrawMoney(double withdrawnAmount){
        if (balance >= withdrawnAmount){
            balance -= withdrawnAmount;
            System.out.println("Your Amount has been successfully withdrawn from Main Balance");
        }else if (balance <= 0){
            System.out.println("You have low balance kindly deposit money first");
        } else {
            withdrawnAmount = balance;
            balance = 0;
        }
        return withdrawnAmount;
    }

}
