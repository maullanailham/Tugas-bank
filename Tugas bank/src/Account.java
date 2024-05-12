public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit Rp" + amount + " berhasil ditambah , Sisa saldo anda: Rp" + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Saldo yang ditarik sebesar Rp" + amount + " , Sisa saldo anda: RP" + this.balance);
        } else {
            System.out.println("program invalid.");
        }

    }
}
