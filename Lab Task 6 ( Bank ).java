class Account {

    double balance;

    Account() {
        balance = 0;
    }

    Account(double b) {
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account(10000);

        a1.deposit(5000);
        a1.withdraw(1000);

        a2.deposit(2000);
        a2.withdraw(3000);

        a1.display();
        a2.display();
    }
}