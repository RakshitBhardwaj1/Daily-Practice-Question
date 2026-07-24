// Last updated: 7/24/2026, 5:30:40 PM
1class Solution {
2    public int[] kWeakestRows(int[][] mat, int k) {
3        int[] arr=new int[mat.length];
4        int n=mat.length;
5        int m=mat[0].length;
6        int[] ans=new int[k];
7        
8        for(int i=0;i<n;i++){
9            int count=0;
10            for(int j=0;j<m;j++){
11                if(mat[i][j]==1){
12                    count++;
13                }
14            }
15            arr[i]=count;
16        }
17        int[] p=Arrays.copyOf(arr,arr.length);
18        Arrays.sort(p);
19        boolean[] used=new boolean[p.length];
20        for(int i=0;i<k;i++){
21            for(int j=0;j<p.length;j++){
22                if(!used[j] && arr[j]==p[i]){
23                    ans[i]=j;
24                    used[j]=true;
25                    break;
26                }
27            }
28        }
29        return ans;
30    }
31}