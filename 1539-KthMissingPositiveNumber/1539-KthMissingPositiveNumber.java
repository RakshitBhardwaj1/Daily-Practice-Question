// Last updated: 11/8/2025, 10:13:37 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        HashSet<Integer> st=new HashSet<>();
        for(int a:arr){
            st.add(a);
        }
        int num=1;
        ArrayList<Integer> ll=new ArrayList<>();
        while(ll.size()<k){
            if(!st.contains(num)){
                ll.add(num);
            }
            num++;
        }             
        return ll.get(ll.size()-1);
    }
}