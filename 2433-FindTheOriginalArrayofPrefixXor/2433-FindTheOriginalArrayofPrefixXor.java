// Last updated: 11/3/2025, 9:34:22 PM
class Solution {
    public int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i > 0; --i)
            pref[i] ^= pref[i - 1];
        return pref;
    }
}