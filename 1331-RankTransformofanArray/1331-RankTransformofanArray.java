// Last updated: 10/25/2025, 8:13:28 PM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] num=Arrays.copyOf(arr,arr.length);
        Arrays.sort(num);
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(!map.containsKey(num[i])){
                map.put(num[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                arr[i]=map.get(arr[i]);
            }
        }
        return arr;
    }
}