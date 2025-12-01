// Last updated: 12/1/2025, 4:04:25 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit=0;
4        for(int i=1;i<prices.length;i++){
5            if(prices[i]>prices[i-1]){
6                profit+=Math.abs(prices[i-1]-prices[i]);
7            }
8        }
9        return profit;
10    }
11}