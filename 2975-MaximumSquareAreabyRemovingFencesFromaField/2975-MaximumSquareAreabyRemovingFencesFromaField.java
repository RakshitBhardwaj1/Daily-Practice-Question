// Last updated: 1/16/2026, 11:09:00 PM
1class Solution {
2
3    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
4        Set<Integer> hEdges = getEdges(hFences, m);
5        Set<Integer> vEdges = getEdges(vFences, n);
6
7        long res = 0;
8        for (int e : hEdges) {
9            if (vEdges.contains(e)) {
10                res = Math.max(res, e);
11            }
12        }
13
14        if (res == 0) {
15            return -1;
16        } else {
17            return (int) ((res * res) % 1000000007);
18        }
19    }
20
21    private Set<Integer> getEdges(int[] fences, int border) {
22        Set<Integer> set = new HashSet<>();
23        List<Integer> list = new ArrayList<>();
24
25        for (int fence : fences) {
26            list.add(fence);
27        }
28
29        list.add(1);
30        list.add(border);
31        Collections.sort(list);
32
33        for (int i = 0; i < list.size(); i++) {
34            for (int j = i + 1; j < list.size(); j++) {
35                set.add(list.get(j) - list.get(i));
36            }
37        }
38
39        return set;
40    }
41}