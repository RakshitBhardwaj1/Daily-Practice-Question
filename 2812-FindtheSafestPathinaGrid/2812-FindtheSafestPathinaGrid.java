// Last updated: 7/1/2026, 9:14:39 PM
1class Solution {
2    public int minElement(int[] nums) {
3        int n=nums.length;
4        ArrayList<Integer> l=new ArrayList<>();
5        for(int num:nums){
6            String str=String.valueOf(num);
7            int sum=0;
8            for(char ch:str.toCharArray()){
9                sum+=Character.getNumericValue(ch);
10            }
11            l.add(sum);
12        }
13        int min=Integer.MAX_VALUE;
14        for(int i=0;i<l.size();i++){
15            min=Math.min(min,l.get(i));
16        }
17        return min;
18    }
19}