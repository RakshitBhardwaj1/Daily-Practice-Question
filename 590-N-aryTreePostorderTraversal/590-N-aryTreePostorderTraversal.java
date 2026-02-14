// Last updated: 2/14/2026, 4:30:48 PM
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
17}
18*/
19
20class Solution {
21    public List<Integer> postorder(Node root) {
22        ArrayList<Integer> ll=new ArrayList<>();
23        Post(root,ll);
24        return ll;
25    }
26    public void Post(Node root,ArrayList<Integer> ll){
27        if(root==null){
28            return;
29        }
30        for(Node child:root.children){
31            Post(child,ll);
32        }
33        ll.add(root.val);
34    }
35}