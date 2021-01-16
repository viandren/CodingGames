/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.viandren.coding_games.euler.F11_F20;

import hu.viandren.coding_games.Utils;

/**
 *
 * @author FrontSoft
 */
public class F12 {

  public static void run() {
    int factorcount = 0;
    int n = 1;
    long sum = 0;
    while (factorcount <= 500) {
      factorcount = 0;
      sum += n;
      n++;

      if (n > 1000 && sum % 2 == 0 && sum % 3 == 0 && sum % 5 == 0) {
        factorcount = Utils.getCountOfAllDivisorsOfNumber(sum);
      }

    }
    System.out.println(sum);
  }
}
