// Last updated: 10/13/2025, 11:12:24 PM
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int start = 0; start < n; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, n - 1);

            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }
}
