class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged;
        
        if (nums1.length == 0) {
            merged = nums2;
        } else if (nums2.length == 0) {
            merged = nums1;
        } else {
            merged = IntStream.concat(
                Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
        }

        double median;
        int len = merged.length;
        int n = len / 2;
        if (len % 2 == 0 && len > 1) {
            median = (merged[n] + merged[n - 1]) / (double)2;
        } else {
            median = merged[n];
        }

        return median;
    }
}