// Last updated: 3/12/2026, 8:09:50 AM
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
17    int md=0;
18    public List<Integer> rightSideView(TreeNode root) {
19        ArrayList<Integer> l=new ArrayList<>();
20        rightSide(root,0,l);
21        return l;
22    }
23    
24    public void rightSide(TreeNode root,int cl,ArrayList<Integer> l){
25        
26        if(root==null){
27            return;
28        }
29        if(md==cl){
30            l.add(root.val);
31            md++;
32        }
33        rightSide(root.right,cl+1,l);
34        rightSide(root.left,cl+1,l);
35    }
36}