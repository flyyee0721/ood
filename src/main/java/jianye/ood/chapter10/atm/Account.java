package jianye.ood.chapter10.atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import jianye.ood.chapter10.atm.Exception.InsufficentBalanceException;
/**
 * Created by jianye on 3/13/17.
 */
public class Account {

    private int id = -1;

    private String userName = null;

    private double interestRate = 0.0;

    private Double balance = 0.0;

    private Date date = null;

    private List<TransactionHistory> history = new ArrayList<TransactionHistory>();

    public Account() { }

    public Account(int id, String userName) {
        this(id, userName, 0.03, 0.0);
    }

    public Account(int id, String userName, double interestRate, double balance) {
        this.id = id;
        this.userName = userName;
        this.interestRate = interestRate;
        this.balance = balance;
        this.date = new Date();
        //history = new ArrayList<TransactionHistory>();
    }

    public int getId() { return id; }

    public void setId(int id) { this.id =id; }

    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }

    public double getInterestRate() { return interestRate; }

    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public double getBalance() { return balance; }

    //Should we provide a setBalance function?
    public void setBalance(double balance) { this.balance = balance; }

    public List<TransactionHistory> getHistory() { return history;  }

    public void deposit(double amount) {
        synchronized (balance) {
            balance += amount;
        }
        synchronized (history) {
            history.add(new TransactionHistory(new Date(), balance - amount, balance, amount));
        }
    }

    public void withdraw(double amount) throws InsufficentBalanceException {
        synchronized (balance) {
            if (amount <= 0) { return; }
            if (balance < amount) {
                throw new InsufficentBalanceException();
            }
        }
        balance -= amount;
        synchronized (history) {
            history.add(new TransactionHistory(new Date(), balance + amount, balance, amount));
        }
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
       if (obj == null)  { return false; }
       if (obj == this) { return true; }
       if (!(obj instanceof  Account)) { return false; }
       Account that = (Account)obj;
       return that.getId() == this.id;
    }
}
