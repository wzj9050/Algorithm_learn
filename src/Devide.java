/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */

/**
 * @author ZijinDesktop2
 * @date 2021/5/28 19:12
 */
public class Devide {
    public static void main(String[] args) {
        int a =1;

        System.out.println(factorial(a));
    }
    static int factorial(int n){
        if (n==1){
            return 1;
        }
            return n*factorial(n-1);

    }

}
