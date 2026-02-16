// Last updated: 2/16/2026, 7:48:42 AM
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        ArrayList<Integer> ll=new ArrayList<>();
19        Post(root,ll);
20        return ll;
21    }
22    public static void Post(TreeNode root, ArrayList<Integer> ll){
23        if(root==null){
24            return;
25        }
26        Post(root.left,ll);
27        Post(root.right,ll);
28        ll.add(root.val);
29    }
30}