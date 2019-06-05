package com.xiedaimala;

import com.xiedaimala.demo.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void evaluatesExpression() {
        int[][] arr = {
                {2,7,11,15},
                {2,6,11,15},
                {0,7,1,3},
                {5,7,110,12},
                {10,90,101,1},
        };
        int[] target = {
                9,
                13,
                4,
                19,
                111
        };

        for (int i = 0; i < arr.length ; i++) {
            int[] res = Solution.twoSum(arr[i],target[i]);
            int num1 = arr[i][res[0]];
            int num2 = arr[i][res[1]];
            int sum = num1 + num2 ;
            assertEquals(target[i], sum);
        }
    }
}
