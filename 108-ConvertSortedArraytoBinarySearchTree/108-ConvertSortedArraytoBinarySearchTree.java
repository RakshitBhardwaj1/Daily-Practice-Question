// Last updated: 3/14/2026, 4:22:57 PM
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return bst(nums,0,nums.length-1);
19    }
20    public TreeNode bst(int[] nums,int si,int ei){
21        if(si>ei){
22            return null;
23        }
24        int mid = (si + ei)/2;
25        TreeNode nn = new TreeNode(nums[mid]);
26        nn.left = bst(nums,si,mid-1);
27        nn.right = bst(nums,mid+1,ei);
28        return nn;
29    }
30}