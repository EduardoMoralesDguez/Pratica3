import java.util.Date;

public class Cuenta {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Cuenta (int id, double balance, double annualInterestRate, Date dateCreated){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate/100;
        this.dateCreated = new Date();
    }

    public Cuenta (int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Fondos insuficientes para el retiro.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
