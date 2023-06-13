public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = "[,|\n]";
        String numbersWithoutDelimiter = numbers;

        if (numbers.startsWith("//")) {
            delimiter = String.valueOf(numbers.charAt(2));
            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("\n") + 1);
        }

        return sumNumbers(numbersWithoutDelimiter, delimiter);
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
