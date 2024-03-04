public class Subarray_Sum_Equals_K_560 {
    //bad approach
    public int subarraySum(int[] nums, int k) {
        int n = nums.length; // size of the given array.
        int count = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            int sum = 0;
            for (int j = i; j < n; j++) { // ending index j
                // calculate the sum of subarray [i...j]
                // sum of [i..j-1] + arr[j]
                sum += nums[j];

                // Increase the count if sum == k:
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}


