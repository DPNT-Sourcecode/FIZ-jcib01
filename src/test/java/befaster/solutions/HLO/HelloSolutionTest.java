package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by sujith on 08/10/2018.
 */
public class HelloSolutionTest {

    private HelloSolution helloSolution;
    @Before
    public void setUp(){
        helloSolution = new HelloSolution();
    }

    @Test
    public void hello() throws Exception {
        assertThat(helloSolution.hello("World"), equalTo("Hello, World!"));
        assertThat(helloSolution.hello("James"), equalTo("Hello, James!"));
    }

}