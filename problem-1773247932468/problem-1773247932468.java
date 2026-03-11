// Last updated: 3/11/2026, 10:22:12 PM
1class Solution {
2    public int bitwiseComplement(int n) {
3
4        if(n == 0)
5            return 1;
6
7        int mask = 0;
8
9        int temp = n;
10
11        while(temp > 0){
12            mask = (mask << 1) | 1;
13            temp >>= 1;
14        }
15
16        return mask ^ n;
17    }
18}