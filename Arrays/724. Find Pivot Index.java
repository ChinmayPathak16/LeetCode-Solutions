class Solution {
    public int pivotIndex(int[] nums) {

        // Calculate total sum of the array
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        // sum2 will store the left-side sum
        int sum2 = 0;

        // Traverse the array to find pivot index
        for (int i = 0; i < nums.length; i++) {

            // Check if left sum == right sum
            // Right sum = total sum - left sum - current element
            if (sum - sum2 - nums[i] == sum2)
                return i;

            // Update left sum
            sum2 += nums[i];
        }

        // If no pivot index found
        return -1;
    }
}
