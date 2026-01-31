// Last updated: 1/31/2026, 9:38:01 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for(int i = 0; i < s.length(); i++){
6            char ch = s.charAt(i);
7
8            if(ch == '('|| ch=='[' || ch=='{'){
9                st.push(ch);
10            } else {
11                if(st.isEmpty()) return false;
12                char top=st.pop();
13                if(ch==')' && top!='(') return false;
14                if(ch==']' && top!='[') return false;
15                if(ch=='}' && top!='{') return false;
16            }
17        }
18        return st.isEmpty();
19    }
20}
21