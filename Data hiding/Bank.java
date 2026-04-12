class BankAccount{
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
    }
    else{
        System.out.println("Invalid amount. Deposit must be greater than zero.");
    }
    }

    public void showBalance(){
        System.out.println("Current balance: " + balance);
    }
}

public class Bank{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.showBalance();
    }
}