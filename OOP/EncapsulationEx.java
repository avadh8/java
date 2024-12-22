class BankAccount{

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName,double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance > 0){
            this.balance = initialBalance;
        }else{
            this.balance = 0;
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    // deposit method
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("new balance of account : "+balance );
        }else{
            System.out.println("invalid deposit amount");
        }
    }

    //widthdraw method
    public void widthdraw(double amount){
        if (amount >0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        }else
            System.out.println("insufficient balance");
    }
}

public class EncapsulationEx {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("12345","Avadh Bhesaniya", 230000);

        System.out.println("Account Number : "+ b1.getAccountNumber());
        System.out.println("Account Holder Name : "+ b1.getAccountHolderName());
        System.out.println("Account Balance : "+ b1.getBalance());

        b1.deposit(15000);

        b1.widthdraw(12000);
        b1.widthdraw(233000);
    }
}
