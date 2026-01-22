// Last updated: 1/22/2026, 11:28:45 PM
1class Solution {
2    public int minPair(List<Integer> v) {
3        int minSum = (int)1e9;
4        int pos = -1;
5
6        for(int i = 0; i < v.size() - 1; i ++){
7            int sum = v.get(i) + v.get(i + 1);
8            if (sum < minSum) {
9                minSum = sum;
10                pos = i;
11            }
12        }
13        return pos;
14    }
15
16    public void mergePair(List<Integer> v, int pos) {
17        v.set(pos, v.get(pos) + v.get(pos + 1));
18        v.remove(pos + 1);
19    }
20
21    public int minimumPairRemoval(int[] nums) {
22        List<Integer> v = new ArrayList<>();
23        for(int x : nums) v.add(x);
24
25        int ops = 0;
26        while(!isSorted(v)){
27            int pos = minPair(v);
28            mergePair(v, pos);
29            ops++;
30        }
31        return ops;
32    }
33
34    private boolean isSorted(List <Integer> v) {
35        for(int i = 0; i < v.size() - 1; i ++){
36            if(v.get(i) > v.get(i + 1)) return false;
37        }
38        return true;
39    }
40}