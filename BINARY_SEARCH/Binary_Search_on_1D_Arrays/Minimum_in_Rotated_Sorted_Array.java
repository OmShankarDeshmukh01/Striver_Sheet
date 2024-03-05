
public class Minimum_in_Rotated_Sorted_Array{
    public static int findMin(int[] nums) {
        int start =0;
        int end =nums.length -1;
        int temp = nums[0];
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] < temp){
                temp = nums[mid];
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[] ={3,4,5,1,2};
        int num = findMin(arr);
        System.out.println(num);
    }
}
