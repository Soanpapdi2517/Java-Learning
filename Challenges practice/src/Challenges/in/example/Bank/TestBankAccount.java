package Challenges.in.example.Bank;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount myacc = new BankAccount(001,"Sonu Yadav");
        myacc.depositMoney(600);
        myacc.withdrawMoney(20);
        System.out.println(myacc.getBalance());
        myacc.withdrawMoney(580);
        myacc.withdrawMoney(5);
        myacc.depositMoney(50);
        myacc.withdrawMoney(100);
        System.out.println(myacc.getBalance());

    }
}
