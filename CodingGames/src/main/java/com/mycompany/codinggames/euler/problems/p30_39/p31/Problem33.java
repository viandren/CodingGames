/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codinggames.euler.problems.p30_39.p31;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viand
 */
public class Problem33 {

    public Long getAnswer() {

        List<Double> nums = new ArrayList<>();
        List<Double> noms = new ArrayList<>();

        for (double i = 10; i < 100; i++) {
            for (double j = 10; j < 100; j++) {
                if ((i / j) < 1) {

                    String numerator = String.valueOf(i);
                    String denominator = String.valueOf(j);
                    double newj = 0;
                    double newi = 0;
                    if (numerator.charAt(1) != '0') {
                        if (numerator.charAt(1) == denominator.charAt(0)) {
                            newi = Integer.parseInt(numerator.charAt(0) + "");
                            newj = Integer.parseInt(denominator.charAt(1) + "");
                            if (newj != 0 && i / j == newi / newj) {
                                System.out.println(i + "/" + j);
                                nums.add(i);
                                noms.add(j);
                            }
                        }
                    }

                }
            }
        }
        double nominator = noms.get(0) 
                * noms.get(1)
                * noms.get(2) 
                * noms.get(3);
        
        
        double numerator = nums.get(0) 
                * nums.get(1)
                * nums.get(2)
                * nums.get(3);
         
        
        System.out.println(numerator);
        System.out.println(nominator);
        
        for (double i = 1; i < nominator && i < numerator; i++) {
            if (nominator % i == 0 
                    && numerator % i == 0){
                nominator /= i;
                numerator /= i;
                System.out.println(i);
            }
        }
        System.out.println(numerator);
        System.out.println(nominator);
        return (long) nominator;
    }
    
    
    public int findLowestCommonTerm(int num1, int num2, int num3, int num4){
        int resnum = 1;
        while(resnum % num1 != 0
                || resnum % num2 != 0
                || resnum % num3 != 0
                || resnum % num4 != 0){
            resnum++;
        }
        
        return resnum;
    }
    
    

}
