import exception.NegativeNumberException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    /**
     * PARAMETER GIVEN ======> RETURNS
     * EXAMPLE 1: "" => 0
     * EXAMPLE 2: "1" => 1
     * EXAMPLE 3: "1,2" => 3
     * EXAMPLE 4: "1,2,3 => 6
     * EXAMPLE 5: “1\n2,3” => 6
     * EXAMPLE 6:
     * “//[delimiter]\n[numbers…]”
     * “//;\n1;2” => 3
     * :rotating_light:
     * :heavy_check_mark:
     */

    private final StringCalculatorMain stringCalculator = new StringCalculatorMain();

    @Test
    public void should_return_zero_if_empty_string_is_passed() throws NegativeNumberException {
        int result = stringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void should_return_single_parameter_number() throws NegativeNumberException {
        int result = stringCalculator.add("1");
        assertEquals(1, result);
    }

    @Test
    public void should_return_addition_of_two_numbers() throws NegativeNumberException {
        int result = stringCalculator.add("1,2");
        assertEquals(3, result);
    }

    @Test
    public void should_return_addition_of_numbers_given() throws NegativeNumberException {
        int result = stringCalculator.add("1,2,3");
        assertEquals(6, result);
    }

    @Test
    public void should_add_numbers_with_newline_regex() throws NegativeNumberException {
        int result = stringCalculator.add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    public void admitting_delimiter() throws NegativeNumberException {
        int result = stringCalculator.add("//;\n1;2");
        assertEquals(3, result);
    }

    @Test
    public void should_throw_exception_if_there_is_a_negative_number() {
        assertThrows(NegativeNumberException.class, () -> stringCalculator.add("//;\n1;2;-5"));
    }

}
