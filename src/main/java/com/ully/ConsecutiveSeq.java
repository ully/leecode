package com.ully;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1,
 2, 3, 4]. Return its length: 4.
 Your algorithm should run in O(n) complexity.

 * Created by ully.li on 2016/9/7.
 */
public class ConsecutiveSeq {


    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(findLong(nums));
    }



    public static int findLong(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();

        for (int n : nums) set.add(n);

        int max = 0;

        for (int n : nums) {
            int count = 0;
            if (set.isEmpty()) break;

            int val = n;
            while (set.remove(val--))
                count++;

            val = n;
            while (set.remove(++val))
                count++;

            max = Math.max(count, max);

        }

        return max;
    }
}
