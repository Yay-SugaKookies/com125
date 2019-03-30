
package kbilab3;

import java.util.Scanner;

public class KBILab3 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Hello. What is your name?");
     String name = input.next();
     System.out.println("Hi, "+ name +"! How old are you?");
     int age = Integer.parseInt(input.next());
     System.out.println("So you're "+age+", eh? That's not old at all!");
     System.out.println("How much do you make, "+name+"?");
     double money = Double.parseDouble(input.next());
     System.out.println(" ");
     System.out.println(money+"! Is hope that's per hour and not per year! LOL!");
    }
    
}
