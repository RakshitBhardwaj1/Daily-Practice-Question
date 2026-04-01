// Last updated: 4/1/2026, 4:38:48 PM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int[] arr=new int[n];
6
7        int k=0;
8        int left=0;
9        int right=n-1;
10        while(left<=right){
11            if(k<n) arr[k++]=nums[left++];
12            if(k<n) arr[k++]=nums[right--];
13        }
14        return arr;
15    }
16}