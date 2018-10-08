package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String numberString = number.toString();
        String result = "";
        if (number % 3 == 0) {
            result = result + "fizz";
        }
        if (number % 5 == 0) {
            result = result + "buzz";
        }

        if (result.isEmpty()) {
            result = result + numberString;

        }
        return result;
    }

}
