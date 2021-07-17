import org.junit.Assert;
import org.junit.Test;

public class TestBank {

    @Test
    public void bankTest1() {
        Bank bank = new Bank();
        bank.setBankName("TDBank");

        String expected = "TDBank";
        String actual = bank.getBankName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bankTest2() {
        Bank bank = new Bank("Chase","100 French Street");

        String expected = "100 French Street";
        String actual = bank.getBranchLocation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bankTest3() {
        Bank bank = new Bank("Chase","100 French Street");

        String expected = "100 French Street";
        String actual = bank.getAtmLocation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bankTest4() {
        Bank bank = new Bank("Chase","100 French Street");
        bank.setAtmLocation("Malls Boulevard");

        String expected = "Malls Boulevard";
        String actual = bank.getAtmLocation();

        Assert.assertEquals(expected, actual);
    }
}
