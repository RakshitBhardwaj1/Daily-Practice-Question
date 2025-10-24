// Last updated: 10/24/2025, 11:14:32 AM
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (valueDiff < 0) return false; 

        long w = (long) valueDiff + 1; 
        Map<Long, Long> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            long v = nums[i];
            long bucketId = getBucketId(v, w);

            // check same bucket
            if (map.containsKey(bucketId)) {
                return true;
            }
            // check neighbor buckets
            if (map.containsKey(bucketId - 1) && v - map.get(bucketId - 1) < w) {
                return true;
            }
            if (map.containsKey(bucketId + 1) && map.get(bucketId + 1) - v < w) {
                return true;
            }

            // put current value
            map.put(bucketId, v);

            // remove the value that's now outside the index window
            if (i >= indexDiff) {
                long oldBucketId = getBucketId(nums[i - indexDiff], w);
                map.remove(oldBucketId);
            }
        }

        return false;
    }

    private long getBucketId(long x, long w) {
        // floorDiv handles negatives correctly
        return Math.floorDiv(x, w);
    }
}
