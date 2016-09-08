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
      int[] seq = {-1,0,1,2,-1,4};
      List<int[]> result = findSumSeq(seq);
        for(int[] re : result){
            for(int i=0;i<re.length;i++){
                System.out.println(re[i]);
            }
        }

    }

    private static List<int[]> findSumSeq(int[] seq) {

        Arrays.sort(seq);
        int i=0;
        int j=1;
        List<int[]> list = new ArrayList<int[]>();
        int[] result = new int[3];
        while(i<j){
            j = i+ 1;
            int k= seq.length - 1;
            while(j<k) {
                int v = seq[i] + seq[j] + seq[k];
                if (v > 0) {
                    k = k - 1;
                    while (j < k && seq[k] == seq[k-1]) {
                            k--;
                    }
                }else if(v<0){
                    j= j+1;
                    while(j<k && seq[j] == seq[j-1]){
                        j= j+1;
                    }

                }else{
                    result[0] =seq[i];
                    result[1] =seq[j];
                    result[2] =seq[k];
                    list.add(result);
                }
            }
            i = i+1;
        }


        while(i< seq.length && seq[i] == seq[i-1]){
            i = i+1;
        }
        return list;
    }
}
