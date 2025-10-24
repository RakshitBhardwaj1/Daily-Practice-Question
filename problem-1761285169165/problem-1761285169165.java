// Last updated: 10/24/2025, 11:22:49 AM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int j=0;
        for(int n:pushed){
            st.push(n);

            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }

        }
        return st.isEmpty();
    }
}