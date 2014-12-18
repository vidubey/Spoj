package com.vidyakant.spoj;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 18/12/14.
 */
public class EIGHTS {

    public static BigInteger findFatLady(BigInteger num){
        int[] map = {192,442,692,942};
        num = num.subtract(new BigInteger("1"));
        BigInteger mapSize = new BigInteger(map.length+"");
        int  index = num.mod(mapSize).intValue();
        BigInteger addend = new BigInteger(map[index]+"");
        BigInteger multiplicand = new BigInteger("1000");
        return num.divide(mapSize).multiply(multiplicand).add(addend);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tCases = sc.nextInt();
        while(tCases > 0) {
            BigInteger num = sc.nextBigInteger();
            System.out.println(findFatLady(num));
            tCases--;
        }

    }
}
