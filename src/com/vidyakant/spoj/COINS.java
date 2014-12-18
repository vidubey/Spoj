package com.vidyakant.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 18/12/14.
 */
public class COINS {

    public static long countCoins(long coins,HashMap<Long,Long> map){
        if(coins<12)
            return coins;
        else{
            if(map.containsKey(coins))
                return map.get(coins);
            else{
                long count = countCoins(coins/2,map)+countCoins(coins/3,map)+countCoins(coins/4,map);
                map.put(coins,count);
                return count;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<Long,Long> map = new HashMap<Long,Long>();
        while(sc.hasNext()){
            System.out.println(countCoins(sc.nextLong(),map));
        }
    }
}
