package com.ully;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 The function twoSum should return indices of the two numbers such that they add up to the target, where
 index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not
 zero-based.

 You may assume that each input would have exactly one solution.
 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 * Created by ully.li on 2016/9/7.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums ={3,2,4};

        int[] result = findResult(nums,6);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    private static int[] findResult(int[] nums, int target) {

        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        int[] result = {-1,-1};
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int x = target - nums[i];

            if(map.get(x) != null && map.get(x) != i){
                result[0] = i;
                result[1] = map.get(x);
                break;
            }

        }


        return result;
    }
}
