public class Find_the_Smallest_Divisor_Given_a_Threshold {
    //to find the maximum number
    public static int maximumNum(int nums[]){
        int max = Integer.MIN_VALUE;
        int n =nums.length;
        for(int i=0;i<n ;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    //to find the sum
    public static int sumByd(int arr[] , int div){
        int n = arr.length;
        int sum =0;
        
        for(int i =0;i< n;i++){
            //main line
            sum += Math.ceil((double)arr[i] / (double)(div));
        }
        return sum;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = maximumNum(nums);
        while( start <= end){
            int mid = (start +end)/2;

            if(sumByd(nums , mid) <= threshold){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int limit = 8;
            int ans = smallestDivisor(arr, limit);
            System.out.println("The minimum divisor is: " + ans);
        }
}
