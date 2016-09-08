package com.ully;

/**
 * Created by ully.li on 2016/8/31.
 *
 * 􁣾􄔟
 There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted
 arrays. The overall run time complexity should be O(log(m + n)).
 *
 *
 * 1,3,5,8,9,10,15
 * 2,4,6,7
 *
 *
 *
 */
public class MedianArray {

    public static void main(String[] args){



    }



    public static int findNum(int[] Anums,int[] Bnums,int k){
        if(Anums.length==0 && Bnums.length > 0) {
            return Bnums[k-1];
        }

        if(Anums.length>0 && Bnums.length == 0) {
            return Anums[k-1];
        }


        int ia = 0;
        int ja = Anums.length-1;
        int ib = 0;
        int jb = Bnums.length-1;
        return findNNest(Anums,ia,ja,Bnums,ib,jb,k-1);
    }

    private static int findNNest(int[] anums, int ia, int ja, int[] bnums, int ib, int jb, int k) {

        if(anums[k/2+1] > bnums[k/2+1]){
           // ib=k/2
        }
        return 0;
    }
}
