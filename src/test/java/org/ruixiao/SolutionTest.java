package org.ruixiao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Logger LOG = LogManager.getLogger(SolutionTest.class.getName());

    @BeforeAll
    static void setup() {
        LOG.info("@BeforeAll - executes once before all test methods in this class");
    }

    @AfterAll
    static void done() {
        LOG.info("@AfterAll - executed after all test methods.");
    }

    @BeforeEach
    void init() {
        LOG.info("@BeforeEach - executes before each test method in this class");
    }

    @AfterEach
    void tearDown() {
        LOG.info("@AfterEach - executed after each test method.");
    }

    @Test
    public void testGetSum() {
        Solution solution = new Solution();
        int sum = solution.getSum(2, 3, 4);

        assertEquals(9, sum);
    }

}
