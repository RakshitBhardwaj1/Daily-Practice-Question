// Last updated: 2/3/2026, 7:51:48 PM
1class Solution {
2
3    public boolean isTrionic(int[] nums) {
4        int n = nums.length;
5        int i = 1;
6        while (i < n && nums[i - 1] < nums[i]) {
7            i++;
8        }
9        int p = i - 1;
10        while (i < n && nums[i - 1] > nums[i]) {
11            i++;
12        }
13        int q = i - 1;
14        while (i < n && nums[i - 1] < nums[i]) {
15            i++;
16        }
17        int flag = i - 1;
18        return (p != 0) && (q != p) && (flag == n - 1 && flag != q);
19    }
20}