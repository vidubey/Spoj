package com.vidyakant.spoj;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 17/12/14.
 */
public class TOANDFRO {

    public static String decryptInput(String input,int columnLength){
        String result = "";
        int rows = input.length()/columnLength;
        int k=0;
        char[][] eString = new char[rows][columnLength];
        for(int i=0;i<rows;i++){
            if(i%2==1){
                for(int j=columnLength-1;j>=0;j--)
                    eString[i][j] = input.charAt(k++);
            }
            else{
                for(int j=0;j<columnLength;j++)
                    eString[i][j] = input.charAt(k++);
            }
        }

        for(int j=0;j<columnLength;j++){
                for(int i=0;i<rows;i++)
                    result+=eString[i][j];

        }

        return result;

    }

    public static String decryptString(String input, int k){
        String result = "";
        int count=0,incre=k;
        for(int i=0;i<k;i++,incre--){
            for(int j=i;j<input.length();){
                result+=input.charAt(j);
                if(count%2==0)
                    j+=2*incre-1;
                else
                    j+=2*i+1;
                count++;
            }
            count=0;
        }

        return result;
    }


    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String input;
        int columnLength = sc.nextInt();

        while(columnLength != 0){
            input = sc.next();
            System.out.println(decryptString(input,columnLength));
            columnLength = sc.nextInt();
        }
    }
}
