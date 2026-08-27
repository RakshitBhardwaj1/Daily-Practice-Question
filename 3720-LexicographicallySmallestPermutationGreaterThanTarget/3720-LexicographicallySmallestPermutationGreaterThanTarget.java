// Last updated: 8/27/2026, 9:13:35 PM
1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int[] cnt = new int[26];
4
5        for (char ch : s.toCharArray()) {
6            cnt[ch - 'a']++;
7        }
8
9        for (char ch : target.toCharArray()) {
10            cnt[ch - 'a']--;
11        }
12
13        for (int i = target.length() - 1; i >= 0; i--) {
14            int cur = target.charAt(i) - 'a';
15            cnt[cur]++;
16
17            boolean ok = true;
18            for (int x : cnt) {
19                if (x < 0) {
20                    ok = false;
21                    break;
22                }
23            }
24
25            if (!ok) continue;
26
27            int next = -1;
28            for (int c = cur + 1; c < 26; c++) {
29                if (cnt[c] > 0) {
30                    next = c;
31                    break;
32                }
33            }
34
35            if (next == -1) continue;
36
37            cnt[next]--;
38
39            StringBuilder ans = new StringBuilder(target.substring(0, i));
40            ans.append((char) ('a' + next));
41
42            for (int c = 0; c < 26; c++) {
43                while (cnt[c]-- > 0) {
44                    ans.append((char) ('a' + c));
45                }
46            }
47
48            return ans.toString();
49        }
50
51        return "";
52    }
53}