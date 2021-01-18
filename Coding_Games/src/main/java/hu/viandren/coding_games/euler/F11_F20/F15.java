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
public class F15 {

  public static void run() {

    System.out.println(leapcount(17, 0, 0));
    //137_846_528_820
  }


  public static long leapcount(int m, int x1, int y1) {


    if (x1 == y1 && y1 == m) {
      return 1;
    } else {
      long cnt = 0;
      if (x1 < m) {
        cnt += leapcount(m, x1 + 1, y1);
      }
      if (y1 < m) {
        cnt += leapcount(m, x1, y1 + 1);
      }
      return cnt;
    }

  }
}
