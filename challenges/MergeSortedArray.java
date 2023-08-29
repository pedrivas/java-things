// https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;

class MergeSortedArray {

    public static void main(String[] args) {
        merge(
                new int[]{1, 2, 3, 0, 0, 0},
                3,
                new int[]{2, 5, 6},
                3
        );
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalElements = m + n;
        int[] sortedArray = new int[totalElements];

        if (m >= 0) System.arraycopy(nums1, 0, sortedArray, 0, m);
        if (n >= 0) System.arraycopy(nums2, 0, sortedArray, m, n);
        Arrays.sort(sortedArray);

        System.arraycopy(sortedArray, 0, nums1, 0, totalElements);

    }
}