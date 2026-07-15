// Last updated: 7/15/2026, 9:18:29 AM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int sum_odd=0;
4        int sum_even=0;
5        for(int i=0;i<2*n;i++){
6            if(i%2==0){
7                sum_even+=i;
8            }
9            else{
10                sum_odd+=i;
11            }
12        }
13        return gcd(sum_odd,sum_even);
14    }
15    public static int gcd(int a,int b){
16        while(b!=0){
17
18        
19        int temp=b;
20        b=a%b;
21        a=temp;
22        }
23        return a;
24    }
25}