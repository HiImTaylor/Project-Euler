/* Problem 5 - https://projecteuler.net/problem=5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20
 */
package projecteuler5;

/** Approach: 
 * We are going in do this "brute force". We will start at 2, and iteratively check if the number we are at 
 * is divisible by the numbers from 1 to 20.
 *
 * @author taylor
 */
public class SmallestMultiple {

    public static void main(String[] args) {
        boolean solved = false;
        int x = 2;
        do{
            for (int y = 1; y <= 20; y++){
                if (x % y == 0){
                    solved = true;
                }else{
                    x++;
                }
            }
        }while (solved != false);
        
        System.out.println(x);
    }
    
}
