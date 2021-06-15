import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
        CILab test = new CILab();
        test.setString("Google");
        boolean actual = test.detectCapitalUse();
        boolean expect = true;
        assertEquals(actual, expect);
    }
    @Test
    public void detectCapitalUseTest2() {
        CILab test = new CILab();
        test.setString("GOogle");
        boolean actual = test.detectCapitalUse();
        boolean expect = false;
        assertEquals(actual, expect);
    }


}
