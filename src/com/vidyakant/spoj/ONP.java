package com.vidyakant.spoj;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by vidyakant.dubey on 16/12/14.
 */
public class ONP {

    public static String reversePolish(String s){
        Stack<String> val = new Stack<String>();

        Stack<String> operator = new Stack<String>();

        for(int i=0;i<s.length();i++){
            char item = s.charAt(i);
            if(item>='a' && item<='z')
                val.push(String.valueOf(item));
            else if(item == ')'){
                String val2 =  val.pop();
                String val1 = val.pop();
                String op = operator.pop();
                val.push(val1.concat(val2).concat(op));
            }
            else if(item == '(')
                continue;
            else
                operator.push(String.valueOf(item));

        }
        return val.pop();
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int tCases = sc.nextInt();
        while(tCases>0){
            System.out.println(reversePolish(sc.next()));
            tCases--;
        }
    }
}
