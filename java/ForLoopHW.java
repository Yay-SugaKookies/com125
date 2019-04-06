
package forloophw;

import java.util.Scanner;


public class ForLoopHW {

    public static void main(String[] args) {
        
        for(int i = 0; i<= 10; i++){
            System.out.println("Mr. Mitchell is cool.");
        }
         /*   2)	Counting Machine
                Write a program that gets an integer from the user. 
                Count from 0 to that number. Use a for loop to do it.*/
         Scanner user = new Scanner(System.in);
         System.out.print("Count to: ");
         int c = user.nextInt();
         for (int i = 0; i<=c; i++){
             System.out.print(i+" ");
         }
         /*   Counting Machine Revisited
               Write a program that gets three integers from the user. 
               Count from the first number to the second number in
               increments of the third number. Use a for loop to do it.*/
         System.out.println(" ");
         System.out.print("Count From: ");
         int f = user.nextInt();
         System.out.print("Count To: ");
         int t = user.nextInt();
         System.out.print("Count By: ");
         int b = user.nextInt();
         for (int i = f; i<=t; i+=b){
             System.out.print(i+" ");
         }
         /*   3)	Counting By Halves
                Write a program that uses a for loop. With the loop,  
                make the variable x go from -10 to 10, counting by 0.5.
                (This means that x can't be an int.)*/
        System.out.println(" ");
        System.out.println("x");
        System.out.println("------");
        for (double x = -10; x <= 10; x+=0.5){
            System.out.println(x);
        }
    }
    
}
