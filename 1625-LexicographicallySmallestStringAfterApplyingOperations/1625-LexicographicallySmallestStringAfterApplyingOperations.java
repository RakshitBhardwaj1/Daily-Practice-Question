// Last updated: 10/19/2025, 2:03:28 PM
import java.util.*;

class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        
        String smallest = s;
        queue.offer(s);
        visited.add(s);
        
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            if (curr.compareTo(smallest) < 0) {
                smallest = curr;
            }
            
            // Operation 1: Add 'a' to odd indices
            char[] chars = curr.toCharArray();
            for (int i = 1; i < chars.length; i += 2) {
                int newDigit = (chars[i] - '0' + a) % 10;
                chars[i] = (char) ('0' + newDigit);
            }
            String added = new String(chars);
            
            if (visited.add(added)) {
                queue.offer(added);
            }
            
            // Operation 2: Rotate by b
            String rotated = curr.substring(curr.length() - b) + curr.substring(0, curr.length() - b);
            if (visited.add(rotated)) {
                queue.offer(rotated);
            }
        }
        
        return smallest;
    }
}