// Last updated: 10/31/2025, 10:47:30 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        // Count occurrences of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find numbers that appear more than once
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        // Convert list to array
        int[] result = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }

        return result;
    }

}