package com.ully;

import java.util.Arrays;
import java.util.Collections;

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

     Follow up for ”Remove Duplicates”: What if duplicates are allowed at most twice?
     For example, Given sorted array A = [1,1,1,2,2,3],
     Your function should return length = 5, and A is now [1,1,2,2,3]
 *
 *
 */
public class DuplicatesFind_2 {

    public static void main(String[] args){
        int[] nums = {1,1,2,2,2,3,3,3,3,4,4,5};
        int len = find2(nums);
        System.out.println(len);
    }



    public static int find(int[] nums){
        if(nums.length <= 1){
            return nums.length;
        }

        int index = 0;
        int times = 2;
        int ctimes = 0;
        for(int i=1;i<nums.length;i++){

            if(nums[index] != nums[i]){
                nums[++index] = nums[i];
                ctimes = 0;
            } else if(nums[index] == nums[i] && ctimes<times){
                ctimes++;
                nums[++index] = nums[i];
            }
        }

        return index+1;
    }


    public static int find2(int[] nums){
        if(nums.length<=2){
            return nums.length;
        }

        int index =3;
        for(int i=3;i<nums.length;i++){
            if(nums[index-3] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }

        return index++;
    }
}



