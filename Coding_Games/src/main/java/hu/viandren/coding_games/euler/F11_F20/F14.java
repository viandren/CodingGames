/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.viandren.coding_games.euler.F11_F20;

/**
 *
 * @author FrontSoft
 */
public class F14 {

  public static void run() {
    long chaincnt;
    long longest = 0;
    long szam = 0;

    for (int num = 1000000; num > 1; num--) {
      chaincnt = 1;
      for (long i = num; i > 1;) {

        if (i % 2 == 0) {
          i = i / 2;
        } else {
          i = i * 3 + 1;
        }
        chaincnt++;
      }

      if (chaincnt > longest) {
        longest = chaincnt;
        szam = num;
      }
    }
    System.out.println(szam);
  }
}
