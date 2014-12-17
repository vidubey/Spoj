package com.vidyakant.spoj;

import java.util.Scanner;

public class ADDREV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  tCases = sc.nextInt();
        while(tCases>0){
            System.out.println(Integer.parseInt(new StringBuffer(String.valueOf(Integer.parseInt(new StringBuffer(sc.next()).reverse().toString())+Integer.parseInt(new StringBuffer(sc.next()).reverse().toString()))).reverse().toString()));
            tCases--;
        }


    }
}
