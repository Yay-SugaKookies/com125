package pkgwhile;

import java.util.Random;
import java.util.Scanner;

public class While {
    
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        //System.out.println(num);
        Scanner g = new Scanner(System.in);
        System.out.println("Pick a number from 0 to 10.");
        int guess = g.nextInt();
        boolean play = true;
        int i = 2;
        
        while (play){
            while (i!=0){
            if(num != guess){
                System.out.println("Try again!");
                guess = g.nextInt();
                i--;
            }
            else{
                System.out.println("Well done! Do you want to play again? (y/n)");
                String p = g.next();
                if(p.equals("y")){
                  i = 2;
                  num = random.nextInt(10);
                  //System.out.println(num);
                  System.out.println("Pick a number from 0 to 10.");
                  guess = g.nextInt(); 
                }
                else if (p.equals("n")){
                    play = false;
                }
                else{
                    System.out.println("Please type either y for yes or n for no.");
                }
            }
            
        }
        System.out.println("You ran out of trys. The answer was "+num+". Do you want to play again? (y/n)");
        String p = g.next();
                if(p.equals("y")){
                  i = 2;
                  num = random.nextInt(10);
                  //System.out.println(num);
                  System.out.println("Pick a number from 0 to 10.");
                  guess = g.nextInt(); 
                }
                else if (p.equals("n")){
                    play = false;
                }
                else{
                    System.out.println("Please type either y for yes or n for no.");
                }
    }
    
    }}
