public class StringCalculator {
    public static int add(final String numbers) throws Exception {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!(number.trim().isEmpty()) && !(Integer.parseInt(number.trim()) > 1000)) {
                returnValue += Integer.parseInt(number.trim());
            }
            else if (Integer.parseInt(number.trim()) < 0){
                throw new Exception("negatives not allowed.");
            }
        }
        return returnValue;
    }
}

