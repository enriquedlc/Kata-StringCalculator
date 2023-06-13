public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = getDelimiter(numbers);
        String numbersWithoutDelimiter = getNumbersWithoutDelimiter(numbers);

        return sumNumbers(numbersWithoutDelimiter, delimiter);
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

    private int sumNumbers(String numbers, String delimiter) {
        int result = 0;

        String[] numberArray = numbers.split(delimiter);

        for (String number : numberArray) {
            result += Integer.parseInt(number);
        }

        return result;
    }
}
