// Last updated: 8/19/2026, 9:27:21 PM
1class Solution {
2
3    public int maxNumberOfFamilies(int n, int[][] rs) {
4        HashMap<Integer, Integer> mp = new HashMap<>(); 
5        for(int[] r: rs) {
6            int row = r[0], seat = r[1]; 
7            mp.merge(row, 1 << (10 - seat), (a, b) -> a | b);
8        }
9        int ans = (n - mp.size()) * 2; 
10        int[] masks = {0b0111100000, 0b0000011110, 0b0001111000};
11
12        for(int x: mp.values()) {
13            for(int m: masks) {
14                if((m & x) == 0) {
15                    ans++; 
16                    // set the bits 
17                    x |= m; 
18                }
19            }
20        }
21        return ans; 
22    }
23    public int maxNumberOfFamiliesUsingList(int n, int[][] rs) {
24        // How many rows are there in reservesSeats.length -> only for these we have to check 
25        // rest all are empty 
26        // so we can simply find the grps from them 
27        // 10 seats -> we have to choose grp of 4 -> 2 distinct we can have. 
28        // 1 & 10 - seat are not included
29        HashMap<Integer, List<Integer>> mp = new HashMap<>(); // max length can be 1e4. 
30        for(int[] r: rs) {
31            // we can always add 1 & 10 
32            if(r[1] == 1 || r[1] == 10) continue; 
33            mp.computeIfAbsent(r[0], k -> new ArrayList<>()).add(r[1]); 
34        }
35
36        int sz = mp.size(); // unique rows in map, 
37        int left = n - sz; // left rows which are completely empty 
38        int ans = 2 * left; // each row contributes 2 seats. 
39
40        for(Map.Entry<Integer, List<Integer>> entry : mp.entrySet()) {
41            List<Integer> value = entry.getValue();  
42        
43            boolean block1 = true, block2 = true, block3 = true; 
44            for(Integer x: value) {
45                if(x >= 2 && x <= 5) block1 = false; 
46                if(x >= 4 && x <= 7) block2 = false; 
47                if(x >= 6 && x <= 9) block3 = false; 
48            }
49
50            if(block1 && block3) ans += 2; 
51            else if(block1 || block2 || block3) ans += 1; 
52
53        }; 
54        return ans; 
55    }
56}