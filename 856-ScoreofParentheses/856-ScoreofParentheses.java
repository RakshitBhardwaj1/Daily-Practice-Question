// Last updated: 2/8/2026, 10:03:51 PM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        int depth=0;
4        int score=0;
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(ch=='('){
8                depth++;
9            }
10            else{
11                depth--;
12                if(s.charAt(i-1)=='('){
13                    score+=(1<<depth);
14                }
15            }
16        }
17        return score;
18    }
19}