public class peak_element {
    public static int findPeakElement(int[] nums) {
        int n =nums.length;
        if(n ==1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[n-1] > nums[n-2]){
            return n-1;
        }
        int start = 1;
        int end = n-2;

        while(start <= end){
            int mid =(start + end)/2;

            //if nums[mid] is a peak;
            if( nums[mid -1] < nums[mid]  &&  nums[mid] > nums[mid+1]){
                return mid;
            }
            //if we are in left
            if( nums[mid] > nums[mid-1]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }

}
