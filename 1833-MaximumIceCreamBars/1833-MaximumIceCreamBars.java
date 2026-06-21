// Last updated: 6/21/2026, 9:36:10 PM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        int n=costs.length;
4        int count=0;
5        Arrays.sort(costs);
6        for(int num:costs){
7            if(coins>=num){
8                coins=coins-num;
9                count++;
10            }
11            else{
12                return count;
13            }
14        }
15        return count;
16    }
17}