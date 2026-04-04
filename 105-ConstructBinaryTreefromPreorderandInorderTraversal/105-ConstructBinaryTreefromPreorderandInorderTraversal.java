// Last updated: 4/4/2026, 8:58:31 AM
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
17    public TreeNode buildTree(int[] preorder, int[] inorder) {
18        return build_tree(preorder, inorder);
19    }
20    public TreeNode build_tree(int[] preorder, int[] inorder){
21        if(preorder.length==0 || inorder.length==0){
22            return null;
23        }
24        int rootval=preorder[0];
25        TreeNode root = new TreeNode(rootval);
26        int index=0;
27        for(int i=0;i<inorder.length;i++){
28            if(inorder[i]==rootval){
29                index=i;
30                break;
31            }
32        }
33        int[] left=Arrays.copyOfRange(inorder,0,index);
34        int[] right=Arrays.copyOfRange(inorder,index+1,inorder.length);
35
36        int leftsize=index;
37        int[] leftpreorder=Arrays.copyOfRange(preorder,1,1+leftsize);
38        int[] rightpreorder=Arrays.copyOfRange(preorder,1+leftsize,preorder.length);
39
40        root.left=build_tree(leftpreorder,left);
41        root.right=build_tree(rightpreorder,right);
42
43        return root;
44
45    }
46}