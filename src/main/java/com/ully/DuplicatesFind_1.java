package com.ully;

/**
 * Created by ully.li on 2016/8/26.
 *
 *
 * 􁣾􄔟
     Given a sorted array, remove the duplicates in place such that each element appear only once
     and return the new length.
     Do not allocate extra space for another array, you must do this in place with constant memory.
     For example, Given input array A = [1,1,2],
     Your function should return length = 2, and A is now [1,2].
 *
 *
 */
public class DuplicatesFind_1 {

    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,3,3,4,5};
        int len = find(nums);
        System.out.println(len);
    }



    public static int find(int[] nums){
        if(nums.length <= 1){
            return nums.length;
        }

        int index = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[index] != nums[i]){
                index++;
                nums[index] = nums[i];
            }
        }

        return index+1;
    }
}



