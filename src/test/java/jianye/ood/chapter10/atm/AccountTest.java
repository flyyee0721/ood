package jianye.ood.chapter10.atm;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import jianye.ood.chapter10.atm.Exception.*;

import static org.testng.Assert.*;

/**
 * Created by jianye on 3/13/17.
 */
public class AccountTest {
    Account account;
    @BeforeMethod
    public void setUp() throws Exception {
        account = new Account();
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetId() throws Exception {
        account = new Account(12, "Daniel Yin", 0.03, 0.0);
        Assert.assertEquals(12, account.getId());
    }

    @Test
    public void testSetId() throws Exception {
        account.setId(1);
        Assert.assertEquals(1, account.getId());
    }

    @Test
    public void testGetUserName() throws Exception {

    }

    @Test
    public void testSetUserName() throws Exception {

    }

    @Test
    public void testGetInterestRate() throws Exception {

    }

    @Test
    public void testSetInterestRate() throws Exception {

    }

    @Test
    public void testGetBalance() throws Exception {

    }

    @Test
    public void testSetBalance() throws Exception {

    }

    @Test
    public void testGetHistory() throws Exception {

    }

    @Test
    public void testDeposit() throws Exception {
        account.setId(10);
        account.setUserName("Daniel Yin");
        account.setInterestRate(0.03);
        account.setBalance(1000.0);
        account.deposit(10.5);
        Assert.assertEquals(1010.5, account.getBalance());
        account.withdraw(250.3);
        Assert.assertEquals(760.2, account.getBalance());
    }

    @Test(expectedExceptions = InsufficentBalanceException.class)
    public void testInsufficientFunds() throws Exception {
        account.setId(10);
        account.setUserName("Daniel Yin");
        account.setInterestRate(0.03);
        account.setBalance(1000.0);
        account.withdraw(13203.0);
    }
}