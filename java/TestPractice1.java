package testpractice1;

import java.util.*;

public class TestPractice1 {

    public static void main(String[] args) {
        Random random = new Random();
        double sum, average,largest,smallest;
        sum=0;
        average=0;
        largest=0;
        String num ="| ";
        double[] nums = new double[10];
        for(int i = 0; i<=nums.length-1; i++){
            nums[i]= random.nextDouble();
            num= num+nums[i]+" |";
        }
        for(int i=0; i<=nums.length-1; i++){
            sum+=nums[i];
        }
        average=sum/nums.length;
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        smallest=nums[1];
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        System.out.println("Nums: "+num);
        System.out.println("-> Sum is : "+sum);
        System.out.println("-> Average is : "+average);
        System.out.println("-> Largest is : "+largest);
        System.out.println("-> Smallest is : "+smallest);
        
    }
    
}
