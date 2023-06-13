public class StringCalculator {
    public int add(String numbers) {
        String regex = "[,\n]";
        if (numbers.isEmpty()) return 0;
        int result = 0;

        String[] addedNumbers = numbers.split(regex);

        for (String numberToAdd : addedNumbers) {
            result += Integer.parseInt(numberToAdd);
        }

        return result;
    }
}