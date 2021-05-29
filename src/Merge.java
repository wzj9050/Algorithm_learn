/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */

import java.util.Arrays;
import java.util.Random;

/**
 * @author ZijinDesktop2
 * @date 2021/5/28 19:12
 */
public class Merge {
    static int[] merge(int[]a, int[]b){
        int m = 0;
        int n = 0;
        int l = a.length+b.length;
        int[] c = new int[l];
        while((m+n)<=l-1) {
            if (m >= a.length && n < b.length) {
                while (n != b.length) {
                    c[a.length + n] = b[n];
                    n = n + 1;
                }
            } else if (m < a.length && n >= b.length) {
                while (m != a.length) {
                    c[b.length + m] = a[m];
                    m = m + 1;
                }
            } else if (m < a.length && n < b.length) {
                if (a[m] >= b[n]) {
                    c[m + n] = b[n];
                    n = n + 1;
                } else if (a[m] < b[n]) {
                    c[m + n] = a[m];
                    m = m + 1;
                }
            }
        }
        return c;
    }



    static int[] sort(int[]a){

        if(a.length>1){
            int mid = a.length/2;
            int[]b = Arrays.copyOfRange(a, 0, mid);
            int[]c = Arrays.copyOfRange(a, mid, a.length);
            b=sort(b);
            c=sort(c);
            a=merge(b,c);
            System.out.println(Arrays.toString(a));
        }
        return a;
    }



    public static void main(String[] args) {
//        int[] int1 = new int[100];
//        for(int i=0; i<100;i++) {
//            int num=(int)(Math.random()*101);
//            int1[i] = num;
//        }
        Random RDG =new Random();
        int[] int1 = RDG.ints(100,0,100).toArray();
        int1 = sort(int1);
        int[] int2 ={3,1};
        int[] int3 ={2};
        System.out.print(Arrays.toString(int1));
        System.out.print(Arrays.toString(merge(int2,int3)));
        int num=(int)(Math.random()*101);


    }

}
