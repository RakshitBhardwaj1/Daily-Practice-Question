// Last updated: 4/4/2026, 9:59:37 AM
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
17    public TreeNode buildTree(int[] inorder, int[] postorder) {
18        return build_Tree(inorder,postorder);
19    }
20    public TreeNode build_Tree(int[] inorder,int[] postorder){
21        if(inorder.length==0 || postorder.length==0){
22            return null;
23        }
24        int rootval=postorder[postorder.length-1];
25
26        TreeNode root=new TreeNode(rootval);
27
28        int index=0;
29        for(int i=0;i<inorder.length;i++){
30            if(inorder[i]==rootval){
31                index=i;
32                break;
33            }
34        }
35        int[] leftinorder= Arrays.copyOfRange(inorder,0,index);
36        int[] rightinorder=Arrays.copyOfRange(inorder,index+1,inorder.length);
37
38        int leftsize=index;
39
40        int[] leftpost=Arrays.copyOfRange(postorder,0,leftsize);
41        int[] rightpost=Arrays.copyOfRange(postorder,leftsize,postorder.length-1);
42
43        root.left=build_Tree(leftinorder,leftpost);
44        root.right=buildTree(rightinorder,rightpost);
45
46        return root;
47    }
48}