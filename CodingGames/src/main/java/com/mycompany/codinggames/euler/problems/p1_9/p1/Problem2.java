/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codinggames.euler.problems.p1_9.p1;

import java.math.BigInteger;

/**
 *
 * @author viand
 */
public class Problem2 {

    public Long getAnswer() {

        BigInteger fibNum1 = BigInteger.valueOf(1);
        BigInteger fibNum2;
        BigInteger fibNumAct = BigInteger.valueOf(0);
        Long fibSum = 0L;
        boolean stop = false;
        while (stop
                == false) {

            fibNum2 = fibNum1;
            fibNum1 = fibNumAct;
            fibNumAct = fibNum1;
            fibNumAct = fibNumAct.add(fibNum2);
            if (fibNumAct.intValue() < 4000000) {
                if (fibNumAct.intValue() % 2 == 0) {
                    fibSum += fibNumAct.intValue();
                }
            } else {
                stop = true;
            }

        }
        
        return fibSum;

    }
}
