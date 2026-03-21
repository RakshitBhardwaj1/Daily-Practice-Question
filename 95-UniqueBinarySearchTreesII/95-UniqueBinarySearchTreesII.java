// Last updated: 3/21/2026, 6:28:38 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<TreeNode> generateTrees(int n) {
18        if (n == 0) return new ArrayList<>();
19        return build(1, n);
20    }
21
22    private List<TreeNode> build(int start, int end) {
23        List<TreeNode> list = new ArrayList<>();
24        if (start > end) {
25            list.add(null);
26            return list;
27        }
28        for (int i = start; i <= end; i++) {
29
30            List<TreeNode> leftTrees = build(start, i - 1);
31            List<TreeNode> rightTrees = build(i + 1, end);
32            for (TreeNode left : leftTrees) {
33                for (TreeNode right : rightTrees) {
34                    TreeNode root = new TreeNode(i);
35                    root.left = left;
36                    root.right = right;
37                    list.add(root);
38                }
39            }
40        }
41
42        return list;
43    }
44}