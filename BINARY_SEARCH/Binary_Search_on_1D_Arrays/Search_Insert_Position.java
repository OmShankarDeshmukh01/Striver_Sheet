
//aply lowerbound  in this question
public class Search_Insert_Position {
    public static int lowerBound(int []arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;
        while( start <= end){
            int mid = (start+end)/2;

            if(arr[mid] >= target){
                ans =mid;
                end =mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int x = 7;
        int ind = lowerBound(arr, x);
        System.out.println("The index is: " + ind);
    }
}
