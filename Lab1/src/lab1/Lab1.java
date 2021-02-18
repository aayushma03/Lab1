
package lab1;
/* 
List all the even numbers 
between 0 and 100
*/

public class Lab1 {
 public static void main(String[] args) {
      int n = 100;
      System.out.print("even numbers from 0 to "+n+" are: ");
        for (int i = 0; i <= n; i++) {
            //if number%2 == 0 it means its an even number, it has to be divisible by 2 
            if(i % 2 == 0) {
                System.out.println(i + " ");
            }
  
        }
    
    }
 
 }
 
