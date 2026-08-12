// Last updated: 8/12/2026, 2:32:47 PM
1import java.util.HashMap;
2
3class LRUCache {
4
5    class Node {
6        int key;
7        int value;
8        Node prev;
9        Node next;
10
11        Node(int key, int value) {
12            this.key = key;
13            this.value = value;
14        }
15    }
16
17    private int capacity;
18
19    private HashMap<Integer, Node> map;
20
21    private Node head;
22    private Node tail;
23
24    public LRUCache(int capacity) {
25        this.capacity = capacity;
26        map = new HashMap<>();
27
28        // Dummy nodes
29        head = new Node(0, 0);
30        tail = new Node(0, 0);
31
32        head.next = tail;
33        tail.prev = head;
34    }
35
36    public int get(int key) {
37
38        // Key does not exist
39        if (!map.containsKey(key)) {
40            return -1;
41        }
42
43        Node node = map.get(key);
44
45        // Move accessed node to MRU position
46        remove(node);
47        add(node);
48
49        return node.value;
50    }
51
52    public void put(int key, int value) {
53
54        // If key already exists
55        if (map.containsKey(key)) {
56
57            Node node = map.get(key);
58
59            node.value = value;
60
61            // Move it to MRU position
62            remove(node);
63            add(node);
64
65            return;
66        }
67
68        // Create new node
69        Node node = new Node(key, value);
70
71        map.put(key, node);
72        add(node);
73
74        // Cache is full
75        if (map.size() > capacity) {
76
77            // Remove LRU node
78            Node lru = head.next;
79
80            remove(lru);
81
82            map.remove(lru.key);
83        }
84    }
85
86    // Remove node from linked list
87    private void remove(Node node) {
88
89        Node previous = node.prev;
90        Node next = node.next;
91
92        previous.next = next;
93        next.prev = previous;
94    }
95
96    // Add node at MRU position
97    private void add(Node node) {
98
99        Node previous = tail.prev;
100
101        previous.next = node;
102        node.prev = previous;
103
104        node.next = tail;
105        tail.prev = node;
106    }
107}
108
109/**
110 * Your LRUCache object will be instantiated and called as such:
111 * LRUCache obj = new LRUCache(capacity);
112 * int param_1 = obj.get(key);
113 * obj.put(key,value);
114 */