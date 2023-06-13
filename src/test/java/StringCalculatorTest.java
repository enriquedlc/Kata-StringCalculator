import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    /**
     * PARAMETER GIVEN ======> RETURNS
     * EXAMPLE 1: "" => 0
     * EXAMPLE 2: "1" => 1
     * EXAMPLE 3: "1,2" => 3
     *
     */

    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void should_return_zero_if_empty_string_is_passed() {
        int result = stringCalculator.add("");
        assertEquals(0, result);
    }


}
