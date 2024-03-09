public class Minimum_Number_of_Days_to_Make_m_Bouquets {
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int currentBouquet = 0;
        int bouquetsFormed = 0;
    
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                currentBouquet++; // Add flower to current bouquet
            } else {
                bouquetsFormed += currentBouquet / k; // Add completed bouquets
                currentBouquet = 0; // Reset current bouquet
            }
        }
    
        bouquetsFormed += currentBouquet / k; // Add any remaining flowers
    
        return bouquetsFormed >= m;
    } 
    
    public static int roseGarden(int[] arr, int k, int m) {
        long val = (long) m * k;
        int n = arr.length; // Size of the array
        if (val > n) return -1; // Impossible case.
    
        // Find maximum and minimum:
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
    
        // Apply binary search:
        int low = mini, high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
