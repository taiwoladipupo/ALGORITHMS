# Dynamic programming approach with optimized space complexxity
# A Dynamic Programming based Python
# Program for 0-1 Knapsack problem
# Returns the maximum value that can
# be put in a knapsack of capacity W
def knapSack(W, wt, val, n):
    # Creating the dp array
    dp = [0 for i in range(W + 1)]

    # iterating the first i elements
    for i in range(1, n + 1):
        # starting from back,so that we also have data of
        # previous computation when taking i-1 items

        for w in range(W, 0, -1):
            if wt[i - 1] <= w:
                # finding the maximum value
                dp[w] = max(dp[w], dp[w - wt[i - 1]] + val[i - 1]);
        # returning the maximum value of knapsack
    return dp[W];


# Driver code
val = [60, 100, 120]

wt = [10, 20, 30]

W = 50;

n = len(val)

print(knapSack(W, wt, val, n));
