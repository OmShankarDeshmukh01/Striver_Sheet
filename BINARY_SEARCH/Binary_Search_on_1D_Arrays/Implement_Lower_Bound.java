package BINARY_SEARCH.Binary_Search_on_1D_Arrays;

public class Implement_Lower_Bound {
    public static int lowerBound(int []arr, int x) {
        int n = arr.length;
        int start = 0;
        int end = n -1;
        int ans = n;
        while(start <= end){
            int mid = (start + end)/2;
            if( arr[mid] >= x){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1 ,2, 2, 3, 3, 5};
        int x = 6;
        int ind = lowerBound(arr, x);
        System.out.println("The index is: " + ind);
    }
}
