package befaster.solutions.FIZ;

import junitparams.JUnitParamsRunner;
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
    public void setUp(){
        solution = new FizzBuzzSolution();
    }

    @Test
    public void fizzBuzz() throws Exception {
        assertThat(solution.fizzBuzz(1), equalTo("1"));
        assertThat(solution.fizzBuzz(2), equalTo("2"));
        assertThat(solution.fizzBuzz(3), equalTo("fizz"));
        assertThat(solution.fizzBuzz(5), equalTo("buzz"));
        assertThat(solution.fizzBuzz(15), equalTo("fizz buzz"));
        assertThat(solution.fizzBuzz(13), equalTo("13"));
    }


}
