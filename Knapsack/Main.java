package Knapsack;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of objects(Please enter the number of items):");

        int  n = input.nextInt();
        //creates integers object for weight w, and value v
        Integer [] w = new Integer[n];
        Integer[] v = new Integer[n];

        System.out.print("Now, please enter the weight of these objects(please enter the weight of these items):");
       for (int i = 0; i < n; i++){
           w[i] = input.nextInt();
       }

        System.out.print("Now, please enter the value of theses objects(please enter the value of these items):");
       for(int i = 0; i < n; i++){
           v[i] = input.nextInt();
       }

        System.out.print("Now, please enter the capacity of these objects(please enter knapsack capacity):");
       int c = input.nextInt();

       /*per unit weight value r[i] = v[i] / w[i] descending

        */

        double startTime = System.currentTimeMillis();

        double [] r = new double[n];

        int [] index = new int[n];
        for (int i = 0; i < n; i++){
            r[i] = (double) v[i] / (double) w[i];
            index[i] = i;
        }
        double temp = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (r[i] < r[j]){
                    temp = r[i];
                    r[i] = r[j];
                    r[j] = temp;

                    int x = index[i];
                    index[i] = index[j];
                    index[j] = x;
                }
            }
        }
        BackTrack call = new BackTrack();
        call. knapSackBackTrack();
     }

}
