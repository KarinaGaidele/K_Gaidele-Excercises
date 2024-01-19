package lt.techin.pd9_1;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("LT12345678954564465", "Vaclav");
        System.out.println(myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(256);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.withdraw(500));
        System.out.println(myAccount.getBalance());
    }
}
