// Last updated: 1/26/2026, 6:15:10 PM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(arr);
5        
6        int minDiff = Integer.MAX_VALUE;
7        
8        for (int i = 1; i < arr.length; i++) {
9            int diff = arr[i] - arr[i - 1];
10            
11            if (diff < minDiff) {
12                minDiff = diff;
13                result.clear();
14                result.add(Arrays.asList(arr[i - 1], arr[i]));
15            } 
16            else if (diff == minDiff) {
17                result.add(Arrays.asList(arr[i - 1], arr[i]));
18            }
19        }
20        
21        return result;
22    }
23}
24