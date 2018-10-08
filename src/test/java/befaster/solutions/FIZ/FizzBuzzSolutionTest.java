package befaster.solutions.FIZ;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by sujith on 08/10/2018.
 */

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzSolutionTest {
    private FizzBuzzSolution solution;

    @Before
    public void setUp() {
        solution = new FizzBuzzSolution();
    }

    @Test
    @Parameters({"1, 1", "2, 2", "3, fizz", "5, buzz", "15, fizz buzz", "13, fizz", "58, buzz", "53, fizz buzz"})
    public void fizzBuzz(Integer number, String result) throws Exception {
        assertThat(solution.fizzBuzz(number), equalTo(result));
    }

    @Test
    @Parameters({ "555, fizz buzz fake deluxe"})
    public void fizzBuzzDeluxe(Integer number, String result) throws Exception {
        assertThat(solution.fizzBuzz(number), equalTo(result));
    }

    /**
        - The old rules for "deluxe" do not apply.
        - A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
        - A number is "buzz deluxe" if it is divisible by 5 AND it has a 5 in it
        - We should still say "fake deluxe" if the "deluxe" number is odd
        - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
        - All the previous rules for "fizz" and "buzz" are still valid
     */

    @Test
    @Parameters({ "555, fizz buzz fake deluxe"})
    public void fizzBuzzNewDeluxe(Integer number, String result) throws Exception {
        assertThat(solution.fizzBuzz(number), equalTo(result));
    }

}