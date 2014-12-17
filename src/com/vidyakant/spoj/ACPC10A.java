package com.vidyakant.spoj;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 17/12/14.
 */
public class ACPC10A {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        while(!(a==0 && b==0 && c==0)){
            if(b-a == c-b && b-a!=0)
                System.out.println("AP "+(c+b-a));
            else
                System.out.println("GP "+(c*(b/a)));
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
    }
}
