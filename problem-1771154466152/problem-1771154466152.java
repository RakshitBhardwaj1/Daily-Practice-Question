// Last updated: 2/15/2026, 4:51:06 PM
1class Solution {
2    public String addBinary(String a, String b) {
3        return new java.math.BigInteger(a, 2).add(new java.math.BigInteger(b, 2)).toString(2);
4
5    }
6}