package org.ruixiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.getSum(1, 2, 3);

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
        ArrayList<Integer> arrList = new ArrayList<Integer>() {{
            add(1);
            add(2);
        }};
    }
}
