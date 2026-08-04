// Last updated: 8/4/2026, 4:05:02 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        HashSet<Integer> set=new HashSet<>();
6        for(int i=0;i<nums.length;i++){
7            min=Math.min(min,nums[i]);
8            max=Math.max(max,nums[i]);
9            set.add(nums[i]);
10        }
11        ArrayList<Integer> l=new ArrayList<>();
12        for(int i=min;i<max;i++){
13            if(!set.contains(i)){
14                l.add(i);
15            }
16        }
17        return l;
18    }
19}