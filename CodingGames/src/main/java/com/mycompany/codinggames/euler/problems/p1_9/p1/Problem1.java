/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codinggames.euler.problems.p1_9.p1;

/**
 *
 * @author viand
 */
public class Problem1 {
    public Long getAnswer() {
        Long sum = 0L;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }

        }
        return sum;
    }
}
