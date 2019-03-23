package weekdayname;

import java.util.Scanner;

public class WeekdayName {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = num.nextInt();
        if(day == 1){
            System.out.println("The day of the week is Sunday.");
        }
        else if(day == 2){
            System.out.println("The day of the week is Monday.");
        }
        else if(day == 3){
            System.out.println("The day of the week is Tuesday.");
        }
        else if(day == 4){
            System.out.println("The day of the week is Wednesday.");
        }
        else if(day == 5){
            System.out.println("The day of the week is Thurday.");
        }
        else if(day == 6){
            System.out.println("The day of the week is Friday.");
        }
        else if(day == 7){
            System.out.println("The day of the week is Saturday.");
        } 
        else{
            System.out.println("Error: Number must be from 1 to 7.");
        }
    }
    
}
