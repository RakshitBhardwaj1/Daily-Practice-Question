// Last updated: 3/11/2026, 4:16:01 PM
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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18        Queue<TreeNode> q=new LinkedList<>();
19        ArrayList<List<Integer>> ll=new ArrayList<>();
20        if(root == null)
21            return ll;
22        q.add(root);
23        while(!q.isEmpty()){
24            int s=q.size();
25            ArrayList<Integer> l=new ArrayList<>();
26
27            for(int i=0;i<s;i++){
28                TreeNode rv=q.poll();
29                l.add(rv.val);
30
31                if(rv.left!=null){
32                    q.add(rv.left);
33                }
34                if(rv.right!=null){
35                    q.add(rv.right);
36                }
37
38            }
39            ll.add(l);
40        }
41        Collections.reverse(ll);
42        return ll;
43    }
44}