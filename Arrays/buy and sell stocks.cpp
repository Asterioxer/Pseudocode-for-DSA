#include <bits/stdc++.h> 
int maximumProfit(vector<int> &prices){
    int minimum = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.size(); i++) {
        int cost = prices[i] - minimum;
        profit = max (profit, cost);
        minimum = min (minimum, prices[i]);
    }
    return profit;
}