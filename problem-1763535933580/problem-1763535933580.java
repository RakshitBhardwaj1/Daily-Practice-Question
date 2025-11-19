// Last updated: 11/19/2025, 12:35:33 PM
class Solution {
    public int longestCycle(int[] edges) {
        int [] in=new int[edges.length];
		for(int i=0; i<edges.length; i++) {
            if(edges[i]!=-1){
                in[edges[i]]++;
            }
			
		}
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<in.length;i++) {
			if(in[i]==0) {
				q.add(i);
			}
		}
		HashSet<Integer> visited=new HashSet<Integer>();
		while(!q.isEmpty()) {
			int e=q.poll();
			visited.add(e);
            if(edges[e]!=-1){
                in[edges[e]]--;

                if(in[edges[e]]==0) {
                    q.add(edges[e]);
                }
            }
			
		}
		int ans=-1;
		for(int i=0;i<edges.length;i++) {
			if(!visited.contains(i)) {
				int c=1;
				visited.add(i);
				int nbrs=edges[i];
				while(nbrs!=i) {
					c++;
					visited.add(nbrs);
					nbrs=edges[nbrs];
				}
				ans=Math.max(ans, c);
			}
		}
		return ans;
    
    }
}