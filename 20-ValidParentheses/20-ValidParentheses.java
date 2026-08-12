// Last updated: 8/12/2026, 6:58:40 PM
1class Solution {
2    public boolean isValid(String s) {
3        int n=s.length();
4        Stack<Character> st=new Stack<>();
5        if(s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}'){
6            return false;
7        }
8        for(int i=0;i<n;i++){
9            char ch=s.charAt(i);
10            if(ch=='('||ch=='['||ch=='{'){
11                st.push(ch);
12            }
13            else{
14                if(st.isEmpty()){
15                    return false;
16                }
17                if(ch==')'&&st.peek()!='(' || ch==']'&&st.peek()!='[' || ch=='}'&&st.peek()!='{'){
18                    return false;
19                }
20                st.pop();
21            }
22        }
23        return st.isEmpty();
24    }
25}