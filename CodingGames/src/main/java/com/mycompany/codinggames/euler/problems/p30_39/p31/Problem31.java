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
public class Problem31 {

    private final List<Integer> coins;
    private Long solutions;

    public Problem31() {
        coins = new ArrayList<>();
        coins.add(1);
        coins.add(2);
        coins.add(5);
        coins.add(10);
        coins.add(20);
        coins.add(50);
        coins.add(100);
        coins.add(200);
        solutions = 0L;
    }

    public Long getAnswer() {
        getSolutions(0, 200);
        return solutions;
    }

    public void getSolutions(int sum, int lastcoin) {
        if (sum < 200) {
            for (Integer coin : coins) {
                if (coin <= lastcoin) {
                    getSolutions(sum + coin, coin);
                }
            }
        } else if (sum == 200) {
            solutions++;
        }

    }

}
