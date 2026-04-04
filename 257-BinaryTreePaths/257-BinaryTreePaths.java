// Last updated: 4/4/2026, 3:12:15 PM
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
17    public List<String> binaryTreePaths(TreeNode root) {
18        ArrayList<String> l=new ArrayList<>();
19        path(root,"",l);
20        return l;
21    }
22    public void path(TreeNode root,String s,ArrayList<String> l){
23        if(root==null){
24            return;
25        }
26        if(s.length()==0){
27            s=root.val+"";
28        }
29        else{
30            s+="->"+root.val;
31        }
32        if(root.left==null && root.right==null){
33            l.add(s);
34            return;
35        }
36        path(root.left,s,l);
37        path(root.right,s,l);
38    }
39}