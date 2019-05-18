package testpractice2;

import java.util.Scanner;

public class TestPractice2 {

    public static void main(String[] args) {
        Scanner side = new Scanner(System.in);
        System.out.print("Please input the side of a hexagon : ");
        double x = side.nextDouble();
        double p = 6*x;
        double a = (6*Math.pow(x, 2))/(4*Math.tan((Math.PI)/6));
        System.out.println("Perimeter : "+p);
        System.out.println("Area : "+a);
    }
    
}
