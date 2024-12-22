class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available balance: " + balance);
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void display(){
        System.out.println("account number : "+ accountNumber +" account balance "+ balance);
    }
}


public class Proble1 {

    public static void main(String[] args) throws InsufficientBalanceException {

        BankAccount b = new BankAccount(230000, "1234");

//        System.out.println("befor widthdraw");
        b.display();
//
//        b.deposit(1000);
//        b.display();

        try {
            b.withdraw(1000);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
