package jianye.ood.chapter10.atm;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by jianye on 3/13/17.
 */
public class BankTest {

    Bank bank;

    @BeforeClass
    public void setUp() throws Exception {
       //bank = new Bank("Giant Bank");
        bank = new Bank();
    }

    @AfterClass
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddAccount() throws Exception {
        //Assert.assertEquals("Giant Bank", bank.getName());
        Assert.assertEquals(2, bank.getId());
    }

}