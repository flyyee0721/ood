package jianye.ood.chapter10.atm;

import lombok.Data;
import java.util.Date;

@Data
/**
 * Created by jianye on 3/13/17.
 */
public class TransactionHistory {

    /** Transaction date. */
    private Date date;

    /** Start balance */
    private double startBalance;

    /** End balance */
    private double endingBalance;

    /** Transaction amount. */
    private double amount;

    public TransactionHistory(Date date, double startBalance, double endingBalance) {
        this(date, startBalance, endingBalance, endingBalance - startBalance) ;
    }

    public TransactionHistory(Date date, double startBalance, double endingBalance, double amount) {
        this.date = date;
        this.startBalance = startBalance;
        this.endingBalance = endingBalance;
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transaction on " + date.toString() + ":\n");
        sb.append("\tStarting balance: " + startBalance + "\n");
        sb.append("\tTransaction amount: " + amount + "\n");
        sb.append("\tEnding balance: " + endingBalance + "\n");
        return sb.toString();
    }
}
