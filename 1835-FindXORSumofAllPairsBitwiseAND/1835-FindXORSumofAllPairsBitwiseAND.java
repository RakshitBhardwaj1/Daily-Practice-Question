// Last updated: 1/21/2026, 12:12:04 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1=0;
4        int xor2=0;
5        for(int i:arr1){
6            xor1^=i;
7        }
8        for(int i:arr2){
9            xor2^=i;
10        }
11        return xor1&xor2;
12    }
13}