/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.viandren.coding_games;

public class Utils {

  public static boolean IsPrime(long num) {

    int j = 2;
    while (j < num / 2) {
      if (num % j == 0) {
        return false;
      }
      j++;
    }
    return true;
  }

  public static long reverseNumber(long num) {
    String nstr = String.valueOf(num);
    StringBuilder sb = new StringBuilder();
    for (int i = nstr.length() - 1; i >= 0; i--) {
      sb.append(nstr.charAt(i));
    }
    return Integer.parseInt(sb.toString());
  }

}
