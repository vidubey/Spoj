package com.vidyakant.spoj;
import java.util.Scanner;
public class LASTDIG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size[]= {1,1,4,4,2,1,1,4,4,2};
        int tCases = sc.nextInt();
        long index = 0;
        int a =0;
        long b;
        while(tCases > 0){
            a = sc.nextInt()%10; b = sc.nextLong();
            if(b== 0)
                index = 0;
            else if(size[a]>1)
                index = (b-1)%size[a]+1;
            else
                index = 1;
            System.out.println((int)Math.pow(a,index)%10);
            tCases--;
        }
    }
}
