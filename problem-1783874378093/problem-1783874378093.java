// Last updated: 7/12/2026, 10:09:38 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int[] num=Arrays.copyOf(arr,arr.length);
4        Arrays.sort(num);
5        int rank=1;
6        HashMap<Integer,Integer> map=new HashMap<>();
7        for(int i=0;i<num.length;i++){
8            if(!map.containsKey(num[i])){
9                map.put(num[i],rank);
10                rank++;
11            }
12        }
13        for(int i=0;i<arr.length;i++){
14            if(map.containsKey(arr[i])){
15                arr[i]=map.get(arr[i]);
16            }
17        }
18        return arr;
19    }
20}