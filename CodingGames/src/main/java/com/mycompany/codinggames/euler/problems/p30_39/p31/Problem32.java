/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codinggames.euler.problems.p30_39.p31;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author viand
 */
public class Problem32 {

    //45228
    public Long getAnswer() {
        Set<Integer> nums = new HashSet();
        Long sum = 0L;
        for (int i = 10; i < 100; i++) {
            for (int j = 100; j < 1000; j++) {
                int m = i * j;
                if (m < 10000 && hasDistinctDigits(i, j, m)){
                    nums.add(m);
                }
            }
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1000; j < 10000; j++) {
                int m = i * j;
                if (m < 10000 && hasDistinctDigits(i, j, m)){
                    nums.add(m);
                }
            }
        }
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }
    
    public boolean hasDistinctDigits(int num1, int num2, int num3) {
        String num1Str = String.valueOf(num1).concat(String.valueOf(num2)).concat(String.valueOf(num3));
        char[] chars = new char[1];
        chars[0] = num1Str.charAt(0);
        for (int i = 1; i < num1Str.length(); i++) {
            chars = addToArrayIfDistinct(chars, num1Str.charAt(i));
            if (chars == null){
                return false;
            }
        }
        return true;
    }


    public boolean ifArrContainsChar(char[] arr, char c) {
        for (char ac : arr) {
            if (ac == c) {
                return true;
            }
        }
        return false;
    }
    
    public char[] addToArrayIfDistinct(char[] arr, char c){
        if (c == '0'){
            return null;
        }
        if (!ifArrContainsChar(arr, c)){
            char[] resArr = new char[arr.length+1];
            System.arraycopy(arr, 0, resArr, 0, arr.length);
            resArr[resArr.length-1] = c;
            return resArr;
        }
        return null;
    }
    

}
