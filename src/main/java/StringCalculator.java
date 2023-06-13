import exception.NegativeNumberException;

import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) throws NegativeNumberException {
        if (numbers.isEmpty()) return 0;

        String delimiter = getDelimiter(numbers);
        String numbersWithoutDelimiter = getNumbersWithoutDelimiter(numbers);

        return sumNumbers(numbersWithoutDelimiter, delimiter);
    }

    private boolean isNegative(String number) {
        return number.startsWith("-");
    }

    private boolean startWithDoubleSlash(String numbers) {
        return numbers.startsWith("//");
    }

    private String getNumbersWithoutDelimiter(String numbers) {
        if (startWithDoubleSlash(numbers)) {
            return numbers.substring(numbers.indexOf("\n") + 1);
        }
        return numbers;
    }

    private String getDelimiter(String numbers) {
        if (startWithDoubleSlash(numbers)) {
            return String.valueOf(numbers.charAt(2));
        }
        return "[,|\n]";
    }

    private int sumNumbers(String numbers, String delimiter) throws NegativeNumberException {
        int result = 0;

        String[] numberArray = numbers.split(delimiter);

        for (String number : numberArray) {
            if (isNegative(number)) {
                throw new NegativeNumberException("negatives not allowed");
            }
            result += Integer.parseInt(number);
        }

        return result;
    }
}
