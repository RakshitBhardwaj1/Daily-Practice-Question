// Last updated: 11/7/2025, 8:32:21 PM
import java.util.*;

class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        
        int low = 0, high = Math.min(tasks.length, workers.length), ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canAssign(tasks, workers, pills, strength, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean canAssign(int[] tasks, int[] workers, int pills, int strength, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int i = k - 1;
        int j = workers.length - 1;
        int pillCount = pills;

        while (i >= 0) {
            while (j >= workers.length - k && j >= 0 && workers[j] + strength >= tasks[i]) {
                dq.addFirst(workers[j]);
                j--;
            }
            if (dq.isEmpty()) return false;
            
            if (dq.peekLast() >= tasks[i]) {
                dq.pollLast(); // assign without pill
            } else {
                if (pillCount == 0) return false;
                dq.pollFirst(); // assign with pill to weakest worker
                pillCount--;
            }
            i--;
        }
        return true;
    }
}
