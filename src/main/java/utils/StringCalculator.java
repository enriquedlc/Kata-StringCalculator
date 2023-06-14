package utils;

import exception.NegativeNumberException;

public class StringCalculator {

    public boolean isNegative(String number) {
        return number.startsWith("-");
    }

    public boolean startWithDoubleSlash(String numbers) {
        return numbers.startsWith("//");
    }

    public String getNumbersWithoutDelimiter(String numbers) {
        if (startWithDoubleSlash(numbers)) {
            return numbers.substring(numbers.indexOf("\n") + 1);
        }
        return numbers;
    }

    public String getDelimiter(String numbers) {
        if (startWithDoubleSlash(numbers)) {
            return String.valueOf(numbers.charAt(2));
        }
        return "[,|\n]";
    }

    public int sumNumbers(String numbers, String delimiter) throws NegativeNumberException {
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
