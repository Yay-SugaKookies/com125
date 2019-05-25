package pkgfinal;

import java.util.Scanner;

public class Final {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] Nums = new double[10];
        Nums[0] = 10.3;
        Nums[1] = 2.5;
        Nums[2] = 6.25;
        Nums[3] = 2.1;
        Nums[4] = 7.0;
        Nums[5] = 9.0;
        Nums[6] = 8.9;
        Nums[7] = 100.5;
        Nums[8] = 10.3;
        Nums[9] = 100.0;
        double sum, average,largest,smallest;
        sum=0;
        average=0;
        largest=0;
        String p = "| ";
        for(int i = 0; i <= Nums.length-1; i++){
            p= p+Nums[i]+" | ";
        }
        for(int i=0; i<=Nums.length-1; i++){
            sum+=Nums[i];
        }
        average=sum/Nums.length;
        for(int i=0; i<=Nums.length-1; i++){
            if(Nums[i]>=largest){
                largest=Nums[i];
            }
        }
        smallest=Nums[1];
        for(int i=0; i<=Nums.length-1; i++){
            if(Nums[i]<=smallest){
                smallest=Nums[i];
            }
        }
        System.out.println("Nums: "+p);
        System.out.println("\n-> Sum is : "+sum);
        System.out.println("-> Average is : "+average);
        System.out.println("-> Largest is : "+largest);
        System.out.println("-> Smallest is : "+smallest);
        System.out.print("Enter a number : ");
        double use = in.nextDouble();
        boolean check = false;
        for(int i=0; i<=Nums.length-1; i++){
            if(Nums[i]==use){
                System.out.println(use+" is in index: "+i);
                check = true;
            }else if((i == Nums.length -1) && (check == false)){
                System.out.println(use+" is not in the array:");
            }
        }
        
    }
    
}
