/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.viandren.coding_games.euler.F1_F10;

import static hu.viandren.coding_games.Utils.IsPrime;

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

  public static void f7() {
    int cnt = 6;
    long num = 13;
    while (cnt < 10001) {
      num++;
      if (IsPrime(num)) {
        cnt++;
      }
    }
    System.out.println(num);
  }

  public static void f8() {
    String digits = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
    long szam = 1L;
    long legnagyobb = 0L;
    for (int k = 0; k < digits.length() - 12; k++) {
      for (int i = 0; i < 13; i++) {
        szam *= Character.getNumericValue(digits.charAt(k + i));
      }
      if (szam > legnagyobb) {
        legnagyobb = szam;
      }
      szam = 1;
    }
    System.out.println(legnagyobb);
  }

}
