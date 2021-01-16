/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.viandren.coding_games.euler.F1_F10;

import static hu.viandren.coding_games.Utils.IsPrime;

/**
 *
 * @author FrontSoft
 */
public class F1_F10 {

  public static void f1() {
    int sum = 0;
    for (int i = 1; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }

    }
    System.out.println(sum);
  }

  public static void f2() {
    Long fibNum1 = 1L;
    Long fibNum2;
    Long fibNumAct = 0L;
    Long fibSum = 0L;
    while (true) {
      fibNum2 = fibNum1;
      fibNum1 = fibNumAct;
      fibNumAct = fibNum1 + fibNum2;
      if (fibNumAct < 4000000) {
        if (fibNumAct % 2 == 0) {
          fibSum += fibNumAct;
        }
      } else {
        break;
      }
    }
    System.out.println("összeg: " + fibSum);
  }

  public static void f3() {
    Long num = 600851475143l;
    Long oszto = 2L;
    while (true) {
      if (IsPrime(oszto)) {
        if (num % oszto == 0) {
          num /= oszto;
          System.out.println(oszto);
        } else {
          oszto++;
        }
      } else {
        oszto++;
      }
      if (num <= 1) {
        break;
      }
    }
  }

  public static void f4() {
    long largest = 0;
    for (int i = 100; i < 1000; i++) {
      for (int j = 100; j < 1000; j++) {
        int num = i * j;
        if (num == reverseNumber(num)) {
          if (num > largest) {
            largest = num;
          }
        }
      }
    }
    System.out.println(largest);
  }

  public static long reverseNumber(long num) {
    String nstr = String.valueOf(num);
    StringBuilder sb = new StringBuilder();
    for (int i = nstr.length() - 1; i >= 0; i--) {
      sb.append(nstr.charAt(i));
    }
    return Integer.parseInt(sb.toString());
  }

  public static void f5() {
    long num = 27720;
    boolean oszthato;

    while (true) {
      if (num % 2520 != 0) {
        num++;
        continue;
      }
      oszthato = true;

      int i = 11;
      while (i < 21) {

        if (num % i != 0) {
          oszthato = false;
          break;
        }
        i++;
      }
      if (oszthato) {
        break;
      }
      num++;
    }
    System.out.println(num);
  }

  public static void f6() {
    long sumsq = 0;
    long sum = 0;
    long ered;

    for (int i = 1; i <= 100; i++) {
      sum += i;
      sumsq += i * i;
    }
    ered = sum * sum - sumsq;
    System.out.println(ered);
  }
}
