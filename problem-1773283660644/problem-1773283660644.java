// Last updated: 3/12/2026, 8:17:40 AM
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
18    public int findBottomLeftValue(TreeNode root) {
19        ArrayList<Integer> l=new ArrayList<Integer>();
20        LeftSide(root,0,l);
21        return l.get(l.size()-1);
22        
23    }
24    public void LeftSide(TreeNode root, int cl,ArrayList<Integer> l){
25        if(root==null){
26            return;
27        }
28        if(md==cl){
29            l.add(root.val);
30            md++;
31        }
32        LeftSide(root.left,cl+1,l);
33        LeftSide(root.right,cl+1,l);
34    }
35}