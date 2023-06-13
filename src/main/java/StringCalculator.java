public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        int result = 0;

        String[] addedNumbers = numbers.split(",");

        for (String numberToAdd : addedNumbers) {
            result += Integer.parseInt(numberToAdd);
        }

        return result;
    }
}