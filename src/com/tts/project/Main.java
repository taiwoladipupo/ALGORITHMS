package com.tts.project;

public class Main {


    // Returns number of bins required
    // using next fit online algorithm
    static int nextFit(int weight[], int n, int c)
    {

        // Initialize result (Count of bins) and remaining
        // capacity in current bin.
        int res = 0, bin_rem = c;

        // Place items one by one
        for (int i = 0; i < n; i++) {
            // If this item can't fit in current bin
            if (weight[i] > bin_rem) {
                res++; // Use a new bin
                bin_rem = c - weight[i];
            }
            else
                bin_rem -= weight[i];
        }
        return res;
    }
    public static void main(String[] args) {
	// write your code here

        int weight[] = { 2, 5, 4, 7, 1, 3, 8 };
        int c = 10;
        int n = weight.length;
        System.out.println("Number of bins required in Next Fit : " + nextFit(weight, n, c));
    }
}

/*
// Java program to find number of bins required using
// First Fit algorithm.
class GFG
{

// Returns number of bins required using first fit
// online algorithm
static int firstFit(int weight[], int n, int c)
{
    // Initialize result (Count of bins)
    int res = 0;

    // Create an array to store remaining space in bins
    // there can be at most n bins
    int []bin_rem = new int[n];

    // Place items one by one
    for (int i = 0; i < n; i++)
    {
        // Find the first bin that can accommodate
        // weight[i]
        int j;
        for (j = 0; j < res; j++)
        {
            if (bin_rem[j] >= weight[i])
            {
                bin_rem[j] = bin_rem[j] - weight[i];
                break;
            }
        }

        // If no bin could accommodate weight[i]
        if (j == res)
        {
            bin_rem[res] = c - weight[i];
            res++;
        }
    }
    return res;
}

// Driver program
public static void main(String[] args)
{
    int weight[] = { 2, 5, 4, 7, 1, 3, 8 };
    int c = 10;
    int n = weight.length;
    System.out.print("Number of bins required in First Fit : "
                    + firstFit(weight, n, c));
}
}
 */