public class Main {

    static class BankAccount {
        private long accountNumber;
        private double balance;
        private String ownerName;

        
        public BankAccount(String ownerName, long accountNumber, double initialBalance) {
            this.ownerName = ownerName;
            this.accountNumber = accountNumber;
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0;
            }
        }

        
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit of $" + amount + " successful.");
            }
            System.out.println(this);
        }

        
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful.");
            } else if (amount > balance) {
                System.out.println("Insufficient funds.");
            }
            System.out.println(this);
        }

        
        @Override
        public String toString() {
            return "BankAccount{accountNumber=" + accountNumber + 
                   ", balance=" + balance + 
                   ", ownerName='" + ownerName + "'}";
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1234567890L, 1000.0);

      
        System.out.println(account);

        
        account.deposit(500.0);

        
        System.out.println("Updated account details:");
        System.out.println(account);

       
        account.withdraw(300.0);

        
        System.out.println("Updated account details:");
        System.out.println(account);

        
        account.withdraw(2000.0);

       
        System.out.println("Updated account details:");
        System.out.println(account);
    }
}
