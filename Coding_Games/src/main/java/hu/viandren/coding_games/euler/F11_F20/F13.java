/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.viandren.coding_games.euler.F11_F20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author FrontSoft
 */
public class F13 {

  public static void run() {

    BigInteger sum = BigInteger.valueOf(0);

    try (BufferedReader br = new BufferedReader(new FileReader("input/f13.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        sum = sum.add(new BigInteger(line));
      }
    } catch (IOException e) {
      System.out.println(e);
    }


    System.out.println(String.valueOf(sum).substring(0, 10));
  }
}
