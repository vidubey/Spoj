package com.vidyakant.spoj;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 17/12/14.
 */
public class AE00 {

    public static long findRectangles(int num){
        long count = 2;
        if(num<=2)
            return num;
        else {
            for (int i = 3; i <= num; i++) {
                count++;
                for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++)
                    if (i % j == 0)
                        count++;
            }
            return count;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findRectangles(num));
    }
}
