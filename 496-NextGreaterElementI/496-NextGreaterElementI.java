// Last updated: 7/2/2026, 5:30:41 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n=nums.length;
4        ArrayList<Integer> ll=new ArrayList<>();
5        int NGE[]=new int[n];
6        Stack<Integer> st=new Stack();
7        for(int i=2*n-1;i>=0;i--){
8            while(!st.isEmpty()&&st.peek()<=nums[i%n]){
9                st.pop();
10
11            }
12            if(i<n){
13                NGE[i]=st.isEmpty()?-1:st.peek();
14
15            }
16            st.push(nums[i%n]);
17        }
18        return NGE;
19    }
20}