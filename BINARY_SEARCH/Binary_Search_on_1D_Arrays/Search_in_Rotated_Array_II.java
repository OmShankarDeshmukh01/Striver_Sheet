public class Search_in_Rotated_Array_II {
    public static boolean search(int[] nums, int target) {
        int start =0;
        int end = nums.length -1;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return true;
            }
            else if(nums[start] == nums[mid]  &&  nums[mid] == nums[end]){
                start = start +1;
                end = end -1;
                continue;
            }
            else if(nums[start] <= nums[mid]){
                if(nums[start] <= target  &&  target <= nums[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(nums[mid] <= target  &&  target <= nums[end]){
                    start = mid+1;
                } 
                else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(arr , target));
    }
}
