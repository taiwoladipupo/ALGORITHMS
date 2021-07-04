package Knapsack;

public class BackTrack {

    //KnapSackBackTrack method
     public  void knapSackBackTrack(){
         int[] w = new int[0]; int [] v = new int[0]; int n = 0; int c = 0;
        int currentWeight = 0;
        int currentValue = 0;
        int maxValue = 0;
        int i = 0;
        while(i > 0){
            if(currentWeight +w[i] <= c){

                currentWeight +=w[i];
                currentValue +=v[i];
                i++;

            }
            else
                break;
        }

        if (i < n){
            maxValue = currentValue;
            System.out.println("Now, the largest values of objects is " +maxValue);
        }
        System.out.println("" + maxValue);
        return;
    }
}
