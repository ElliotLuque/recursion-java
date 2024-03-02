package numeric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NthPowerTest {

    @Test
    void itShouldGiveFifthPower() {
       double real = 2.0;
       double power = 5.0;

       double result = NthPower.nthPower(real, power);

       assertEquals(result, 32.0);
    }

    @Test
    void itShouldNotGiveFourthPower() {
        double real = 2.0;
        double power = 4.0;

        double result = NthPower.nthPower(real, power);

        assertNotEquals(result, 20.0);
    }
}
