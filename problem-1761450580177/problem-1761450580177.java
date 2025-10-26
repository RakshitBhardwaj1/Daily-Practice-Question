// Last updated: 10/26/2025, 9:19:40 AM
class Solution {
    public long removeZeros(long n) {
        String str = String.valueOf(n);
        String noZeros = str.replace("0", "");
        return Long.parseLong(noZeros);
    }
}
