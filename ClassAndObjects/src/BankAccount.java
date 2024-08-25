public class BankAccount {
    public static void main(String[] args) {
        BankCustomer myCustomer = new BankCustomer();
        System.out.println(myCustomer.getCurrentAccountBalance());
        myCustomer.deposit(511);
        System.out.println(myCustomer.getCurrentAccountBalance());
        myCustomer.withdraw(18);
        System.out.println(myCustomer.getCurrentAccountBalance());
    }
}
