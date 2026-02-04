// Last updated: 2/4/2026, 12:22:01 PM
1class Trie {
2
3    class Node{
4		char ch;
5		boolean  isterminal;
6		HashMap<Character,Node> child;
7		
8		public Node(char ch) {
9			this.ch=ch;
10			child=new HashMap<>();
11		}
12	}
13	private Node root;
14	public Trie() {
15		root=new Node('*');
16	}
17	public void insert(String word) {
18        Node curr=root;
19        for(int i=0;i<word.length();i++) {
20        	char ch=word.charAt(i);
21        	if(curr.child.containsKey(ch)) {
22        		curr=curr.child.get(ch);
23        	}else {
24        		Node nn=new Node(ch);
25        		curr.child.put(ch,nn);
26        		curr=nn;
27        	}
28        }
29        curr.isterminal=true;
30    }
31	public boolean search(String word) {
32		Node curr=root;
33        for(int i=0;i<word.length();i++) {
34        	char ch=word.charAt(i);
35        	if(curr.child.containsKey(ch)) {
36        		curr=curr.child.get(ch);
37        	}else {
38        		return false;
39        	}
40        }
41        return curr.isterminal;
42    }
43	public boolean startsWith(String prefix) {
44		Node curr=root;
45        for(int i=0;i<prefix.length();i++) {
46        	char ch=prefix.charAt(i);
47        	if(curr.child.containsKey(ch)) {
48        		curr=curr.child.get(ch);
49        	}else {
50        		return false;
51        	}
52        }
53        return true;
54    }
55}
56
57/**
58 * Your Trie object will be instantiated and called as such:
59 * Trie obj = new Trie();
60 * obj.insert(word);
61 * boolean param_2 = obj.search(word);
62 * boolean param_3 = obj.startsWith(prefix);
63 */