// Last updated: 2/21/2026, 11:01:21 PM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int count=0;
4        
5        for (int i=left;i<=right;i++) {
6            int setBits=Integer.bitCount(i);
7            if (isPrime(setBits)) {
8                count++;
9            }
10        }
11        return count;
12    }
13    
14    private boolean isPrime(int n) {
15        if (n<=1) {
16            return false;
17        }
18        for (int i=2;i*i <= n;i++) {
19            if (n%i==0) {
20                return false;
21            }
22        }
23        
24        return true;
25    }
26}