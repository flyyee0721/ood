package jianye.ood.chapter10.atm.Exception;

/**
 * Created by jianye on 3/13/17.
 */
public class AccountExistException extends Exception {

    public AccountExistException() { super(); }

    public AccountExistException(String message) { super(message); }

    public AccountExistException(String message, Throwable throwable) { super(message, throwable); }

    public AccountExistException(Throwable throwable) { super(throwable); }
}

