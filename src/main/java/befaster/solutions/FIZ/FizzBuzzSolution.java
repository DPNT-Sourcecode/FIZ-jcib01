package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String numberString = number.toString();
        String result = "";
        if (isFizz(number, numberString)) {
            result = appendString(result, "fizz");
        }
        if (isBuzz(number, numberString)) {
            result = appendString(result, "buzz");

        }
        if (isFake(number, numberString)) {
            result = appendString(result, "fake");
        }
        if (isDeluxe(number, numberString)) {
            result = appendString(result, "deluxe");
        }

        if (result.isEmpty()) {
            result = result + numberString;

        }
        return result;
    }

    private boolean isFake(Integer number, String numberString) {
        return isDeluxe(number, numberString) && (number % 2 == 1);
    }

    //new rule for deluxe ...
    private boolean isDeluxe(Integer number, String numberString) {
        if ((number % 3 == 0 && numberString.contains("3")) || (number % 5 == 0 && numberString.contains("5"))) {
            return true;
        }
        return false;
    }

    private boolean allDigitsMatch(String numberString) {
        return numberString.chars().allMatch(c -> c == numberString.charAt(0));
    }

    private boolean isBuzz(Integer number, String numberString) {
        return number % 5 == 0 || numberString.contains("5");
    }

    private boolean isFizz(Integer number, String numberString) {
        return number % 3 == 0 || numberString.contains("3");
    }

    private String appendString(String result, String appendString) {
        if (!result.isEmpty()) {
            result = result + " ";
        }
        return result + appendString;
    }


}
