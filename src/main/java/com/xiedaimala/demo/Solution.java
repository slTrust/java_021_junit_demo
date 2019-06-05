package com.xiedaimala.demo;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        // 第一次的思路 两层循环
    /*
        第一层循环锁定 i=0 的值 1
        第二层循环从   j = i+1 之后开始循环 比对（因为循环时不该包括已经选定的值）
            只要 nums[i] + nums[j] === target 就返回结果
    */
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i + 1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
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

        for (int i = 0; i < arr.length; i++) {
            int[] res = twoSum(arr[i],target[i]);
            System.out.println("["+res[0]+","+res[1]+"]");
        }
    }
}
