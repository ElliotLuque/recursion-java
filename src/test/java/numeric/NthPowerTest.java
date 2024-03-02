package numeric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NthPowerTest {

    @Test
    void itShouldGiveZeroPower() {
        double number = 2.0;
        double power = 0.0;

        double result = NthPower.nthPower(number, power);

        assertEquals(1.0, result);
    }

    @Test
    void itShouldGiveFifthPower() {
       double number = 2.0;
       double power = 5.0;

       double result = NthPower.nthPower(number, power);

       assertEquals(32.0, result);
    }

    @Test
    void itShouldGiveIncorrectPower() {
        double number = 2.0;
        double power = 4.0;

        double result = NthPower.nthPower(number, power);

        assertNotEquals(17.0, result);
    }
}
