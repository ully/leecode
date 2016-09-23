package com.ully;

/**
 * Created by ully.li on 2016/9/23.
 */
public class ArrayMerge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ia = m -1;
        int ib = n -1;
        int icur = m + n -1;

        while(ia>=0 && ib >=0){
            nums1[icur--] = nums1[ia] >= nums2[ib] ? nums1[ia--] : nums2[ib--];
        }

        while(ib>=0){
            nums1[icur--] = nums2[ib--];
        }
    }
}
