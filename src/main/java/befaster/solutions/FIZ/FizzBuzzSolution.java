package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String numberString = number.toString();
        String result = "";
        if(number % 3  == 0){
            result = result+"fizz";
        }            
        return result;
    }

}
