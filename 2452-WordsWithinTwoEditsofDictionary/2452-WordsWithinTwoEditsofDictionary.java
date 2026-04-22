// Last updated: 4/22/2026, 9:53:13 AM
1class Solution {
2
3    static class TrieNode {
4
5        TrieNode[] child = new TrieNode[26];
6        boolean isEnd = false;
7    }
8
9    TrieNode root = new TrieNode();
10
11    void insert(String word) {
12        TrieNode node = root;
13        for (char c : word.toCharArray()) {
14            int idx = c - 'a';
15            if (node.child[idx] == null) node.child[idx] = new TrieNode();
16            node = node.child[idx];
17        }
18        node.isEnd = true;
19    }
20
21    boolean dfs(String word, int i, TrieNode node, int cnt) {
22        if (cnt > 2 || node == null) return false;
23
24        if (i == word.length()) return node.isEnd;
25
26        int idx = word.charAt(i) - 'a';
27
28        // no changes made
29        if (node.child[idx] != null) {
30            if (dfs(word, i + 1, node.child[idx], cnt)) return true;
31        }
32
33        // made changes
34        if (cnt < 2) {
35            for (int c = 0; c < 26; c++) {
36                if (c == idx) continue;
37                if (node.child[c] != null) {
38                    if (dfs(word, i + 1, node.child[c], cnt + 1)) return true;
39                }
40            }
41        }
42
43        return false;
44    }
45
46    public List<String> twoEditWords(String[] queries, String[] dictionary) {
47        for (String w : dictionary) insert(w);
48
49        List<String> res = new ArrayList<>();
50        for (String q : queries) {
51            if (dfs(q, 0, root, 0)) {
52                res.add(q);
53            }
54        }
55        return res;
56    }
57}