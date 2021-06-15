import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("Google");
        boolean actual = myString.detectCapitalUse();
        boolean expect = true;
        assertEquals(actual, expect);
    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("gOOGLE");
        boolean actual = myString.detectCapitalUse();
        boolean expect = false;
        assertEquals(actual, expect);
    }


}
