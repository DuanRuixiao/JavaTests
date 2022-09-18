package org.ruixiao;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testGetSum() {
        Solution solution = new Solution();
        int sum = solution.getSum(2, 3, 4);

        assertEquals(9, sum);
    }

}
