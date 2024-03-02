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

        assertEquals(result, 1.0);
    }

    @Test
    void itShouldGiveFifthPower() {
       double number = 2.0;
       double power = 5.0;

       double result = NthPower.nthPower(number, power);

       assertEquals(result, 32.0);
    }

    @Test
    void itShouldGiveIncorrectPower() {
        double number = 2.0;
        double power = 4.0;

        double result = NthPower.nthPower(number, power);

        assertNotEquals(result, 17.0);
    }
}
