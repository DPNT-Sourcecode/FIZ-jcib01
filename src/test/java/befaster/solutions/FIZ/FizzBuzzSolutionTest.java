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


}