/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.viandren.coding_games;

import java.util.ArrayList;
import java.util.List;

public class Utils {

  public static boolean IsPrime(long num) {

    int j = 2;
    while (j <= num / 2) {
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

  public static List<Integer> getPrimeFactorsOfNumber(Long num) {
    List<Integer> resList = new ArrayList<>();
    int i = 2;
    while (true) {
      if (num % i == 0) {
        resList.add(i);
        num /= i;
        if (num == 1) {
          break;
        }
        i = 2;
      } else {
        i++;
      }
    }

    resList.sort(null);
    return resList;
  }

  public static Integer getCountOfAllDivisorsOfNumber(Long num) {
    List<Integer> primeList = getPrimeFactorsOfNumber(num);
    int elozo = 0;
    int divisorsCount = 1;
    int primeCounter = 1;
    for (Integer prime : primeList) {
      if (prime.equals(elozo)) {
        primeCounter++;
      } else {
        if (elozo != 0) {
          divisorsCount *= primeCounter + 1;
          primeCounter = 1;
        }
        elozo = prime;
      }
    }
    divisorsCount *= primeCounter + 1;

    return divisorsCount;
  }

}
