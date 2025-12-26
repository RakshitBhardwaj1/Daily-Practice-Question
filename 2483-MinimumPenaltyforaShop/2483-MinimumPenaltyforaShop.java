// Last updated: 12/26/2025, 5:59:16 PM
1class Solution {
2    public int bestClosingTime(String customers) {
3        int curPenalty = 0;
4        for (int i = 0; i < customers.length(); i++) {
5            if (customers.charAt(i) == 'Y') {
6                curPenalty++;
7            }
8        }
9        int minPenalty = curPenalty;
10        int earliestHour = 0;
11
12        for (int i = 0; i < customers.length(); i++) {
13            char ch = customers.charAt(i);
14            if (ch == 'Y') {
15                curPenalty--;
16            } else {
17                curPenalty++;
18            }
19            if (curPenalty < minPenalty) {
20                earliestHour = i + 1;
21                minPenalty = curPenalty;
22            }
23        }
24
25        return earliestHour;
26    }
27}