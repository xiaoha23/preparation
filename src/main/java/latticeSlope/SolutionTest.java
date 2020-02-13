package latticeSlope;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void test1_solution(){
        assertEquals("2,-1", solution.solution(-1, 3, 3, 1));
        assertEquals("2,2", solution.solution(-3, 3, 2, 3));
        assertEquals("-3,4", solution.solution(2, 3, -3, 3));
        assertEquals("2,2", solution.solution(3, 3, 3, 2));
        assertEquals("4,3", solution.solution(3, 2, 3, 3));
        assertEquals("-3,4", solution.solution(2, 3, -3, 3));
        assertEquals("7,3", solution.solution(0, 0, 2, 5));
    }
}