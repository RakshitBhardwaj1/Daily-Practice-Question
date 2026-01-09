// Last updated: 1/9/2026, 6:57:15 PM
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
17    public TreeNode subtreeWithAllDeepest(TreeNode root) {
18        if (root == null) return null;
19
20        Map<TreeNode, TreeNode> parent = new HashMap<>();
21        Queue<TreeNode> q = new LinkedList<>();
22        q.offer(root);
23        parent.put(root, null);
24
25        List<TreeNode> lastLevel = new ArrayList<>();
26
27        // BFS traversal
28        while (!q.isEmpty()) {
29            int size = q.size();
30            lastLevel.clear();
31
32            for (int i = 0; i < size; i++) {
33                TreeNode node = q.poll();
34                lastLevel.add(node);
35
36                if (node.left != null) {
37                    parent.put(node.left, node);
38                    q.offer(node.left);
39                }
40                if (node.right != null) {
41                    parent.put(node.right, node);
42                    q.offer(node.right);
43                }
44            }
45        }
46
47        Set<TreeNode> deepest = new HashSet<>(lastLevel);
48
49        // Move upward until all nodes converge
50        while (deepest.size() > 1) {
51            Set<TreeNode> next = new HashSet<>();
52            for (TreeNode node : deepest) {
53                next.add(parent.get(node));
54            }
55            deepest = next;
56        }
57
58        return deepest.iterator().next();
59    }
60}