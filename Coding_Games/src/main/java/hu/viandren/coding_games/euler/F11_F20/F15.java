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


  public static boolean isleaplegal(int m, int x1, int y1, int x2, int y2) {
    if (x1 <= m && y1 <= m) {
      return (((x1 == x2) && (y1 + 1) == y2) || ((y1 == y2) && (x1 + 1) == x2));
    } else {
      return false;
    }
  }

  public static long leapcount(int m, int x1, int y1) {

    long cnt = 0;
    int x2, y2;

    if (x1 == m && y1 == m) {
      cnt = 1;
    } else {

      x2 = x1 + 1;
      y2 = y1;
      if (isleaplegal(m, x1, y1, x2, y2)) {
        cnt += leapcount(m, x2, y2);
      }
      x2 = x1;
      y2 = y1 + 1;
      if (isleaplegal(m, x1, y1, x2, y2)) {
        cnt += leapcount(m, x2, y2);
      }
    }
    return cnt;

  }
}
