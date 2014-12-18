package com.vidyakant.spoj;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 18/12/14.
 */
public class HANGOVER {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sum = 0.00f;
        float[] memory=new float[300];
        for(int i=2;i<memory.length;i++){
            float num=i;
            sum+=1/num;
            memory[i]=sum;
        }

        float key=sc.nextFloat();
        while(key>0.00) {
            int resultIndex=bs(2, memory.length-1, key, memory);
            System.out.println(resultIndex-1+ " card(s)");
            key=sc.nextFloat();
        }
    }

    private static int bs(int low, int high, float key, float[] arr){
        if(low>high){
          return low;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==key){
            return mid;
        }
        else{
            if(key>arr[mid]){
               return bs(mid+1,high,key,arr);
            }else{
                return bs(low,mid-1,key,arr);
            }
        }
    }
}
