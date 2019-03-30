package stringpractice;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        //String word = "window";
        /*int num = word.length();
        System.out.println(num);*/
        //System.out.println(word.indexOf('d'));
        //System.out.println(word.substring(0,4));
        //int in = word.indexOf("o");
        //System.out.println(word.substring(word.length()-2,word.length()));
        Scanner input = new Scanner(System.in);
        System.out.print("Type a word:  ");
        String word = input.next();
        if ((word.length() % 2) == 0){
        System.out.println("even");
        System.out.println(word.substring((word.length()/2)-1,(word.length()/2)+1));
    }
        else{
            System.out.println("odd");
            System.out.println(word.substring((word.length()/2),(word.length()/2)+1));
        }
        
    }
    
}
