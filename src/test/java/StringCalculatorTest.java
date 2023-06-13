import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    /**
     * PARAMETER GIVEN ======> RETURNS
     * EXAMPLE 1: "" => 0
     * EXAMPLE 2: "1" => 1
     * EXAMPLE 3: "1,2" => 3
     */

    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void should_return_zero_if_empty_string_is_passed() {
        int result = stringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void should_return_single_parameter_number() {
        int result = stringCalculator.add("1");
        assertEquals(1, result);
    }

    @Test
    public void should_return_addition_of_two_numbers() {
        int result = stringCalculator.add("1,2");
        assertEquals(3, result);
    }

    @Test
    public void should_return_addition_of_numbers_given() {
        int result = stringCalculator.add("1,2,3");
        assertEquals(6, result);
    }

    @Test
    public void should_add_numbers_with_newline_regex() {
        int result = stringCalculator.add("1\n2,3");
        assertEquals(6, result);
    }

}
