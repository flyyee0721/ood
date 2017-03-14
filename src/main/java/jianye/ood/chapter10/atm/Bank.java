package jianye.ood.chapter10.atm;

import jianye.ood.chapter10.atm.Exception.AccountExistException;

import java.util.Set;
import java.util.HashSet;
/**
 * Created by jianye on 3/13/17.
 */
public class Bank {

    public static final double DEFAULT_INTEREST_RATE = 0.03;

    /** Bank name. */
    private String name;

    /** Opened account set. */
    private Set<Account> accountSet;

    /** User id assigner. */
    private int id = 0;

    /**
     * Constructor.
     *
     * @param name
     */
    public Bank(String name)  {
        this.name = name;
        accountSet = new HashSet<Account>();
    }

    /**
     * Name getter.
     *
     * @return Bank name.
     */
    public String getName() { return name; }

    /**
     *  Id getter.
     *
      * @return Maximum id that has been assigned to accounts currently.
     */
    public int getId() { return id; }

    public final Set<Account> getAccountSet() { return accountSet; }

    public synchronized  boolean openAccount(String name) throws AccountExistException {
        return openAccount(id++, name, DEFAULT_INTEREST_RATE, 0.0);
    }

    public synchronized  boolean openAccount(String name, double balance) throws AccountExistException {
        return openAccount(id++, name, DEFAULT_INTEREST_RATE, balance);
    }

    private synchronized  boolean openAccount(int id, String name, double interestRate, double balance)
        throws AccountExistException {
        if (!accountSet.add(new Account(id, name, interestRate, balance))) {
            throw new AccountExistException("Account " + id + " already exists!");
        }
        return true;
    }

    public synchronized void closeAccount(String name) {
        
    }

}
