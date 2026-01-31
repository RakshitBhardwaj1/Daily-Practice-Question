// Last updated: 1/31/2026, 9:10:11 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> st=new Stack<>();
4        st.push(-1);
5        int max=0;
6        for(int i=0;i<s.length();i++){
7            char ch=s.charAt(i);
8            if(ch=='('){
9                st.push(i);
10            }
11            else{
12                st.pop();
13                if(st.isEmpty()){
14                    st.push(i);
15                }
16                max=Math.max(max,i-st.peek());
17            }
18        }
19        return max;
20    }
21}