package jianye.ood.chapter10.atm.Exception;

/**
 * Created by jianye on 3/13/17.
 */
public class InsufficentBalanceException extends Exception {
    public InsufficentBalanceException() {
        super();
    }
    public InsufficentBalanceException(String message) {
        super(message);
    }
    public InsufficentBalanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficentBalanceException(Throwable cause) {
        super(cause);
    }

}
