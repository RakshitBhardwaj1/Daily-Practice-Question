// Last updated: 3/13/2026, 10:22:18 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        boolean[] visited = new boolean[nums.length];
5        permute1(nums, new ArrayList<>(), result, visited);
6        return result;
7    }
8    public void permute1(int[] nums,List<Integer> l,List<List<Integer>> res,boolean[] visited){
9        if(l.size()==nums.length){
10            res.add(new ArrayList<>(l));
11            return;
12        }
13        for (int i=0;i<nums.length;i++){
14            if(visited[i]) continue;
15            visited[i]=true;
16            l.add(nums[i]);
17
18            permute1(nums,l,res,visited);
19
20            l.remove(l.size()-1);
21            visited[i]=false;
22        }
23    }
24}