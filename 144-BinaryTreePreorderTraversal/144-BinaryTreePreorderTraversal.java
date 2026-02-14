// Last updated: 2/14/2026, 3:03:13 PM
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> ll=new ArrayList<>();
19        PreOrder(root,ll);
20        return ll;
21    }
22    public void PreOrder(TreeNode root,List<Integer> ll){
23        if(root==null){
24            return;
25        }
26        ll.add(root.val);
27        PreOrder(root.left,ll);
28        PreOrder(root.right,ll);
29    }
30}