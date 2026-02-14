// Last updated: 2/14/2026, 4:21:13 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21    public List<Integer> preorder(Node root) {
22        ArrayList<Integer> ll=new ArrayList<>();
23        Pre(root,ll);
24        return ll;
25    }
26    public void Pre(Node root,ArrayList<Integer> ll){
27        if(root==null){
28            return;
29        }
30        ll.add(root.val);
31        for(Node child:root.children){
32            Pre(child,ll);
33        }
34    }
35
36}