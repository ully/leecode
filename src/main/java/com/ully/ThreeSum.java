package com.ully;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Given an array S of n integers, are there elements a; b; c in S such that a + b + c = 0? Find all unique
 triplets in the array which gives the sum of zero.
 Note:
 • Elements in a triplet (a; b; c) must be in non-descending order. (ie, a  b  c)
 • The solution set must not contain duplicate triplets.
 For example, given array S = {-1 0 1 2 -1 -4}.
 A solution set is:
 (-1, 0, 1)
 (-1, -1, 2)
 * Created by ully.li on 2016/9/7.
 */
public class ThreeSum {
    public static void main(String[] args) {
      int[] seq = {-2,0,1,1,2};
        List<List<Integer>> result = findSumSeq(seq);
        for(List<Integer> re : result){
            for(int i=0;i<re.size();i++){
                System.out.println(re.get(i));
            }
        }

    }

    private static List<List<Integer>> findSumSeq(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int j, k, sum;
        for(int i=0;i<nums.length-2;i++){
            j = i+1;
            k = nums.length - 1;
            while(j<k){
                //System.out.println("Checking " + nums[i] + " , " + nums[j] + " , " + nums[k]);
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0){
                    List<Integer> ls = new ArrayList<Integer>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[k]);
                    res.add(ls);
                    j++;k--;
                    while(j<k && nums[k]==nums[k+1]) k--;//to avoid duplicates
                    while(j<k && nums[j]==nums[j-1]) j++;//to avoid duplicates
                } else if (sum > 0){
                    k--;
                    while(j<k && nums[k]==nums[k+1]) k--;//optional skip for non-zero triplets
                } else {
                    j++;
                    while(j<k && nums[j]==nums[j-1]) j++;//optional skip for non-zero triplets
                }
            }
            while(i<nums.length-2 && nums[i]==nums[i+1]){ //to avoid duplicates
                i++;
            }
        }
        return res;
    }
}
