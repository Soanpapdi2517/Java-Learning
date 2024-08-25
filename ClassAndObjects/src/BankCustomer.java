public class BankCustomer {
    String customerName;
    double currentAccountBalance;
    int age;
    Boolean isIndian;
    double earning;
    int accountNumber;

    public void deposit(double addmoney){
        currentAccountBalance += addmoney;
        System.out.println("Your balance is now: " + addmoney);
    }
    public void withdraw(double minusMoney){
            currentAccountBalance -= minusMoney;
            System.out.println("Your balance after deduction is : " + minusMoney);
    }
    public double getCurrentAccountBalance(){
        return currentAccountBalance;
    }
}