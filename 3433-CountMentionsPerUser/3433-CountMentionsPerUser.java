// Last updated: 12/12/2025, 10:56:39 PM
1import java.util.*;
2
3class Solution {
4    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
5        TreeMap<Integer, List<List<String>>> byTime = new TreeMap<>();
6        for (List<String> ev : events) {
7            int t = Integer.parseInt(ev.get(1));
8            byTime.computeIfAbsent(t, k -> new ArrayList<>()).add(ev);
9        }
10
11        int[] mentions = new int[numberOfUsers];
12        boolean[] isOnline = new boolean[numberOfUsers];
13        int[] offlineUntil = new int[numberOfUsers];
14        Arrays.fill(isOnline, true);
15
16        for (Map.Entry<Integer, List<List<String>>> entry : byTime.entrySet()) {
17            int t = entry.getKey();
18            List<List<String>> evs = entry.getValue();
19
20            for (int i = 0; i < numberOfUsers; ++i) {
21                if (!isOnline[i] && offlineUntil[i] <= t) {
22                    isOnline[i] = true;
23                    offlineUntil[i] = 0;
24                }
25            }
26
27            for (List<String> ev : evs) {
28                if (ev.get(0).equals("OFFLINE")) {
29                    int id = Integer.parseInt(ev.get(2));
30                    isOnline[id] = false;
31                    offlineUntil[id] = t + 60;
32                }
33            }
34
35            for (List<String> ev : evs) {
36                if (!ev.get(0).equals("MESSAGE")) continue;
37                String mentionsStr = ev.get(2);
38                String[] tokens = mentionsStr.split("\\s+");
39                for (String token : tokens) {
40                    if (token.equals("ALL")) {
41                        for (int i = 0; i < numberOfUsers; ++i) mentions[i]++;
42                    } else if (token.equals("HERE")) {
43                        for (int i = 0; i < numberOfUsers; ++i)
44                            if (isOnline[i]) mentions[i]++;
45                    } else if (token.startsWith("id")) {
46                        int id = Integer.parseInt(token.substring(2));
47                        if (id >= 0 && id < numberOfUsers) mentions[id]++;
48                    }
49                }
50            }
51        }
52
53        return mentions;
54    }
55}