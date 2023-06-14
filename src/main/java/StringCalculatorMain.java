import exception.NegativeNumberException;
import utils.StringCalculator;

public class StringCalculatorMain {

    StringCalculator utils = new StringCalculator();


    public int add(String numbers) throws NegativeNumberException {
        if (numbers.isEmpty()) return 0;

        String delimiter = utils.getDelimiter(numbers);
        String numbersWithoutDelimiter = utils.getNumbersWithoutDelimiter(numbers);

        return utils.sumNumbers(numbersWithoutDelimiter, delimiter);
    }
}
