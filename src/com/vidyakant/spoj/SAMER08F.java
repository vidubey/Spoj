package com.vidyakant.spoj;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 16/12/14.
 */
public class SAMER08F {

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input!=0){
            System.out.println(((input*(input+1)*(2*input+1))/6));
            input = sc.nextInt();
        }
    }
}
