package com.ully;

/**
 * Created by ully.li on 2016/8/26.
 *
 *
 * 􁣾􄔟
 Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 You are given a target value to search. If found in the array return its index, otherwise return -1.
 You may assume no duplicate exists in the array.
 *
 *
 */
public class SortedArraySearch {

    public static void main(String[] args){
        int[] nums = {4,5,66,7,0,1,2};
        int index = find(nums,17);
        System.out.println(index);
    }



    public static int find(int[] nums,int x){
        int start=0;
        int end = nums.length-1;


        while(start<end){
            int mid = (end-start)/2+start;
            if(nums[mid] == x) {
                return mid;
            }

            if(nums[start] < nums[mid]){

                if(x >=nums[start] && x < nums[mid]) {
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }else{

                if(x>=nums[mid] && x < nums[end]){
                    start = mid;
                }else{
                    end = mid;
                }

            }

        }

        return -1;
    }



    public static int findDuplicate(int[] nums,int x){
        int start=0;
        int end = nums.length-1;


        while(start<end){
            int mid = (end-start)/2+start;
            if(nums[mid] == x) {
                return mid;
            }

            if(nums[start] < nums[mid]){
                if(x >=nums[start] && x < nums[mid]) {
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }else if(nums[start] > nums[mid]){
                if(x>=nums[mid] && x < nums[end]){
                    start = mid;
                }else{
                    end = mid;
                }
            }else{
                start++;
            }

        }

        return -1;
    }
}



