package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String numberString = number.toString();
        String result = "";
        if (number % 3 == 0 || numberString.contains("3")) {
            result = appendString(result, "fizz");
        }
        if (number % 5 == 0 || numberString.contains("5")) {
            result = appendString(result, "buzz");
        }

        if (result.isEmpty()) {
            result = result + numberString;

        }
        return result;
    }

    private String appendString(String result, String appendString) {
        if (!result.isEmpty()) {
            result = result + " ";
        }
        return result + appendString;
    }


}
