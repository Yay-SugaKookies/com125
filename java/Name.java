/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;

import java.util.Scanner;
public class Name {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?  ");
        String name = input.next();
   
        // Say hello 10 times
       /* for (int i=1;i<=1000000000;i++) {
        System.out.println(i+":  Hey, "+name+"!");
        }*/
       
       //Say hello a # of times (Based on user input)
       /*System.out.print("Give me a number: ");
       int num = input.nextInt();
       for (int i = 1; i <= num; i ++){
         System.out.println(i+":  Hey, "+name+"!");  
       }*/
       
       //Ask for a a third value where you ask them print from
       System.out.print("Print From: ");
       int f = input.nextInt();
       System.out.print("Print To: ");
       int s = input.nextInt();
       System.out.print("Print By: ");
       int t = input.nextInt();
       for (int i = f; i <= s; i +=t){
         System.out.println(i+":  Hey, "+name+"!");  
       }
}}
