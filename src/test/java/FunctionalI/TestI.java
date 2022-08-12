package FunctionalI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestI {

    @Test
    public void checkTrue() {
        FirstI firstI = () -> System.out.println("true");
        firstI.checkSomething();

    }

    @Test
    public void checkAssert() {
        boolean actual = SecondI.assertI().checkSomething2("Da", "Da");
        Assert.assertTrue(actual);
    }

    @Test
    public void checkPersona() {
        String checkPersona = ThirdI.personaCheck().checkSomething3("Man", 50, "Den");
        Assert.assertEquals(checkPersona, String.valueOf("50"));
    }

}
