// Last updated: 10/24/2025, 3:46:07 PM
import java.util.*;

class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int[] op : operations) {
            int oldVal = op[0];
            int newVal = op[1];

            int index = map.get(oldVal);
            nums[index] = newVal;

            map.remove(oldVal);
            map.put(newVal, index);
        }

        return nums;
    }
}
