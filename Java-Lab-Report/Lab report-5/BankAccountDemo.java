class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "Sonali Bank";

    // Constructor
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Static Method
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    // Method to display account information
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------------");
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount.showBankName();

        BankAccount acc1 = new BankAccount("1001", "Rahim", 50000);
        BankAccount acc2 = new BankAccount("1002", "Karim", 75000);

        acc1.displayAccount();
        acc2.displayAccount();
    }
}