// Last updated: 2/14/2026, 2:57:46 PM
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18       List<Integer> ans=new ArrayList<>();
19       Inorder(root,ans);
20       return ans;
21    }
22    public void Inorder(TreeNode root,List<Integer> ans){
23         if(root==null){
24            return;
25        }
26        Inorder(root.left,ans);
27        ans.add(root.val);
28        Inorder(root.right,ans);
29    }
30}