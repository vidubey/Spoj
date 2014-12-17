package com.vidyakant.spoj;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 16/12/14.
 */
public class NSTEPS {

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int tCases  = sc.nextInt();
        while(tCases>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x%2==y%2 && x%2 == 0 && x>=y && x-y<=2)
                System.out.println((x+y));
            else if(x%2==y%2 && x%2 != 0 && x>=y && x-y<=2)
                System.out.println((x+y-1));
            else
                System.out.println("No Number");
            tCases--;
        }
    }
}
