// Last updated: 12/29/2025, 10:07:25 PM
1import java.util.*;
2
3class Solution {
4    public boolean pyramidTransition(String bottom, List<String> allowed) {
5        Map<String, List<Character>> map = new HashMap<>();
6
7        // Build mapping: pair -> possible top characters
8        for (String s : allowed) {
9            String key = s.substring(0, 2);
10            char val = s.charAt(2);
11            map.computeIfAbsent(key, k -> new ArrayList<>()).add(val);
12        }
13
14        return dfs(bottom, map);
15    }
16
17    private boolean dfs(String curr, Map<String, List<Character>> map) {
18        // If pyramid is completed
19        if (curr.length() == 1) return true;
20
21        // Generate all possible next levels
22        List<String> nextLevels = new ArrayList<>();
23        buildNext(curr, 0, new StringBuilder(), map, nextLevels);
24
25        // Try each possible next level
26        for (String next : nextLevels) {
27            if (dfs(next, map)) return true;
28        }
29
30        return false;
31    }
32
33    private void buildNext(String curr, int index, StringBuilder sb,
34                           Map<String, List<Character>> map,
35                           List<String> result) {
36
37        if (index == curr.length() - 1) {
38            result.add(sb.toString());
39            return;
40        }
41
42        String key = curr.substring(index, index + 2);
43        if (!map.containsKey(key)) return;
44
45        for (char c : map.get(key)) {
46            sb.append(c);
47            buildNext(curr, index + 1, sb, map, result);
48            sb.deleteCharAt(sb.length() - 1); // backtrack
49        }
50    }
51}
52