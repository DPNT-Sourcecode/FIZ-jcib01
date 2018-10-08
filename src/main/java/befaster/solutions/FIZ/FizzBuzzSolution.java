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
        if(isDeluxe(number, numberString)){
            result = appendString(result, "deluxe");
        }

        if (result.isEmpty()) {
            result = result + numberString;

        }
        return result;
    }

    private boolean isDeluxe(Integer number, String numberString) {
        return false;
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
