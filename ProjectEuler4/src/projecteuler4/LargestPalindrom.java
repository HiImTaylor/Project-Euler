/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler4;
import java.util.*;

/**
 *
 * @author taylo
 */
public class LargestPalindrom {

    /*
   * Problem 4 - https://projecteuler.net/problem=4
   *
   * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit number is 9009 = 91 x 99.
   *
   * Find the largest palindrom made from the product of two 3-digit numbers.
   */
  public static void main(String[] args) {
     int x, y, largest;
     ArrayList<Integer> array = new ArrayList<Integer>();

     //Check all the products. If it is palindrom, add it to the ArrayList. If not, continue to next product.
     for (x = 999; x >= 100; x--){
       for (y = 999; y >= 100; y--){
         int product = x * y;
         char[] nums = toCharArray(product);
         if(isPalindrom(nums)){
           array.add(product);
         }
       }
     }
     //Sort the ArrayList
     Collections.sort(array);

     //Set largest to the largest palindrome
     largest = array.get(array.size() - 1);
     System.out.println(largest);
  }

  //converts the int to an array of characters
  public static char[] toCharArray(int num){
    char[] chars = ("" + num).toCharArray();
    return chars;
  }

  //checks to see if the characters in the character array make a palindrom
  public static boolean isPalindrom(char[] number){
    int x = 0, y = number.length - 1;
    while(y > x){
      if (number[x] != number[y]){
        return false;
      }
      ++x;
      --y;
    }
    return true;
  }
}
