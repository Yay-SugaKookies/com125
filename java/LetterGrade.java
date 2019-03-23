
package lettergrade;

import java.util.Scanner;

public class LetterGrade {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Score: ");
       double score = scan.nextDouble();
       if(score>=92){
           System.out.println("A");
       }
       else if(score>= 80){
           System.out.println("B");
       }
       else if(score>=70){
           System.out.println("C");
       }
       else{
           System.out.println("F");
       }
    }
    
}