class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1; // Pointer for the last element in nums1's initial values
        int j = n - 1; // Pointer for the last element in nums2
        int k = m + n - 1; // Pointer for the last position in nums1

        // Merge from the end to avoid shifting elements
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; // Place larger element at the end
            } else {
                nums1[k--] = nums2[j--]; // Place nums2 element at the end
            }
        }    
    }
}
