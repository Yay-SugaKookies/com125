/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avg;

import java.util.Scanner;

public class AVG {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first value: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second value: ");
        int num2 = input.nextInt();
        System.out.print("Enter your third value: ");
        int num3 = input.nextInt();
        double avg = (num1+num2+num3)/3;
        System.out.println("Your average is: "+avg);
        if (avg>0){
            System.out.println("Your average is positive.");
        }
        else if (avg<0){
            System.out.println("Your average is negative.");
        }
    }
    
}
