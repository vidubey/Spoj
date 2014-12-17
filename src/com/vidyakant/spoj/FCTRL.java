package com.vidyakant.spoj;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 16/12/14.
 */
public class FCTRL {

    public static void computeCount(String input){
        BigInteger num = new BigInteger(input);
        BigInteger iterator = new BigInteger("5");
        BigInteger count = new BigInteger("0");
        while(iterator.compareTo(num)<=0){
            count = count.add(num.divide(iterator));
            iterator = iterator.multiply(new BigInteger("5"));
        }
        System.out.println(count);

    }

    public static void main(String[] a){
        int tCases = 0;
        Scanner sc = new Scanner(System.in);
        tCases = sc.nextInt();
        while(tCases>0){
            computeCount(sc.next());
            tCases--;
        }

    }
}
