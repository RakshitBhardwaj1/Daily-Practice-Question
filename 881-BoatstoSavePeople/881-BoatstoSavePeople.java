// Last updated: 1/24/2026, 8:39:17 AM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        int n=people.length;
4        Arrays.sort(people);
5        int ans=0;
6        int i=0;
7        int j=n-1;
8        while(i<=j){
9            if(people[i]+people[j]<=limit){
10                i++;
11            }
12            
13            j--;
14            ans++;
15        }
16        return ans;
17    }
18}