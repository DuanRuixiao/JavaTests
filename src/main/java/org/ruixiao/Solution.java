package org.ruixiao;

public class Solution {

    public int getSum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

}
