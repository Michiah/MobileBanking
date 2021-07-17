import org.junit.Assert;
import org.junit.Test;

public class TestBankAccount {

    @Test
    public void bankAccountTest1() {
        BankAccount account = new BankAccount();
        account.setCustName("Jamal");

        String expected = "Jamal";
        String actual = account.getCustName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bankAccountTest2() {
        BankAccount account = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);

        double expected = 100.00;
        double actual = account.getCkgBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bankAccountTest3() {
        BankAccount account = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        account.deposit(50.00);

        double expected = 150.00;
        double actual = account.getCkgBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bankAccountTest4() {
        BankAccount account = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        account.withdraw(25.00);

        double expected = 75.00;
        double actual = account.getCkgBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bankAccountTest5() {
        BankAccount TDBank = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        TDBank.setSvgBalance(100.00);
        TDBank.transferFromCkg(50.00);

        double expected = 150.00;
        double actual = TDBank.getSvgBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bankAccountTest5a() {
        BankAccount TDBank = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        TDBank.setSvgBalance(100.00);
        TDBank.transferFromCkg(25.00);

        double expected = 75.00;
        double actual = TDBank.getCkgBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bankAccountTest5b() {
        BankAccount TDBank = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        TDBank.setSvgBalance(100.00);
        TDBank.transferToCkg(50.00);

        double expected = 150.00;
        double actual = TDBank.getCkgBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bankAccountTest5c() {
        BankAccount TDBank = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        TDBank.setSvgBalance(100.00);
        TDBank.transferToCkg(25.00);

        double expected = 75.00;
        double actual = TDBank.getSvgBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bankAccountTest6() {
        BankAccount TDBank = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        BankAccount Chase = new BankAccount();
        Chase.setCkgBalance(100.00);
        TDBank.wire(Chase, 50.00);

        double expected = 150.00;
        double actual = Chase.getCkgBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bankAccountTest6a() {
        BankAccount TDBank = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        BankAccount Chase = new BankAccount();
        Chase.setCkgBalance(100.00);
        TDBank.wire(Chase, 50.00);

        double expected = 50.00;
        double actual = TDBank.getCkgBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bankAccountTest7() {
        BankAccount account = new BankAccount();
        account.setAtmPIN(1234);

        int expected = 1234;
        int actual = account.getAtmPIN();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bankAccountTest8() {
        BankAccount account = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        account.addChecks(150);

        int expected = 250;
        int actual = account.getChecks();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bankAccountTest9() {
        BankAccount account = new BankAccount("John","123 Main St","123456","Checking",100.00,1234, 100);
        account.setLoanStatus("Received, In Review");

        String expected = "Received, In Review";
        String actual = account.getLoanStatus();

        Assert.assertEquals(expected, actual);
    }
}
