package work04;

public class BankAccount {
   private int number;
   private Person owner;
   private double balance;

   public BankAccount(int number, Person owner, double balance){
        this.number = number;
        this.owner = owner;
        this.balance = balance;
   }
    public double getBalance() {
        return balance;
    }
    public Person getOwner() {
        return owner;
    }
    public double deposit(double amount){
        return balance += amount;
    }
    public double withdraw(double amount){
        return balance -= amount;
    }
    public void transfer(double amount, BankAccount bankAccount){
        withdraw(amount);
        bankAccount.deposit(amount);
    }

    @Override
    public String toString(){
        return String.format("BankAccount(%d,)", this.number);
    }
}
