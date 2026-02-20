// Last updated: 2/20/2026, 9:38:11 PM
1class Solution {
2    public String makeLargestSpecial(String s) {
3        int count = 0, i = 0;
4        List<String> res = new ArrayList<>();
5        
6        for (int j = 0; j < s.length(); j++) {
7            // Track balance: +1 for '1', -1 for '0'
8            if (s.charAt(j) == '1') count++;
9            else count--;
10            
11            // Found a balanced chunk when count returns to 0
12            if (count == 0) {
13                // Recursively maximize inner part, wrap with 1...0
14                res.add('1' + makeLargestSpecial(s.substring(i + 1, j)) + '0');
15                i = j + 1; // Move to next potential chunk
16            }
17        }
18        
19        // Sort chunks in descending order for largest arrangement
20        Collections.sort(res, Collections.reverseOrder());
21        return String.join("", res);
22    }
23}