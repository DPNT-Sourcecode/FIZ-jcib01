package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by sujith on 08/10/2018.
 */


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
    }


}
