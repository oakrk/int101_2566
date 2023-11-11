package int101.work03;

import int101.work01.Utilitor;
import int101.work02.Person;

public class Account {
    private static long nextNo = 100_000_000;
    private long no;
    private Person owner;
    private double balance;

    public Account(Person owner) {
        if (owner == null)
            throw new NullPointerException();
        this.owner = owner;
        balance = 0.0;
        long result = Utilitor.computeIsbn10(nextNo);
         while (result != 10) {
            nextNo++;
            result = Utilitor.computeIsbn10(nextNo);
         }
        no = nextNo * 10 + result;
        nextNo++;
    }

    public Person getOwner() {
        return owner;
    }
    public long getNo() {
        return no;
    }
    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        return balance += Utilitor.testPositive(amount);
    }

    public double withdraw(double amount){
        return balance = Utilitor.testPositive(balance - Utilitor.testPositive(amount));
    }

    public void transfer(double amount, Account account){
        if (account == null) throw new IllegalArgumentException();
        this.withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Account(");
        stringBuilder.append(no);
        stringBuilder.append("," + balance);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this != obj) return false;
        return true;
    }
}
