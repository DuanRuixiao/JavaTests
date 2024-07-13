package org.ruixiao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Solution {

    private static final Logger LOG = LogManager.getLogger(Solution.class.getName());

    public int getSum(int... nums) {
        LOG.info("starting getSum");
        int sum = 0;
        for (int num : nums) {
            LOG.info("adding {}", num);
            sum += num;
        }
        LOG.info("sum {}", sum);

        return sum;
    }
}
