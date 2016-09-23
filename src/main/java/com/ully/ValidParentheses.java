package com.ully;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by ully.li on 2016/9/21.
 */
public class ValidParentheses {

    public static  void main(String[] args){

        String str ="[])";

        System.out.println(testIsValid(str));
    }

    private static boolean testIsValid(String str) {
        String left= "{[(";
        String right="}])";
        String[] valids = {"{}","[]","()"};

        List<String> list = Arrays.asList(valids);
        char[] testChars = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < testChars.length; i++) {
            if (left.indexOf(testChars[i]) != -1) {
                stack.push(testChars[i]);
            } else {
                if (i==0 || right.indexOf(testChars[i]) == -1) {
                    return false;
                } else {
                    if (!stack.isEmpty()) {
                        char x = stack.pop();
                        if (!list.contains(new String(new char[]{x,testChars[i]}))) {
                            return false;
                        }
                    }else{
                        return false;
                    }
                }

            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }


}
