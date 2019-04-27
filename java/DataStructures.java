package data.structures;

public class DataStructures {

    public static void main(String[] args) {
        double[] scores = new double[5];
        scores[0]=300;
        scores[1]=3.5;
        scores[2]=20;
        scores[3]=7.5;
        scores[4]=1000;
        //double sum = 0;
        //double max = scores[0];
        double min = scores[0];
        for(int i = 0; i<=(scores.length -1); i++){
            //scores[i]+=5;
            //sum+=scores[i];
            //System.out.println(scores[i]);
            /*if(scores[i]>=max){
                max=scores[i];
            }*/
            if(scores[i]<=min){
                min=scores[i];
            }
        }
        //System.out.println(sum);
        //System.out.println(max);
        System.out.println(min);
    }
    
}
