
// arr[index] > x
public class Implement_Upper_Bound {
    public static int upperBound(int []arr, int x) {
        int n = arr.length;
        int start = 0;
        int end = n -1;
        int ans = n;
        while(start <= end){
            int mid = (start + end)/2;
            if( arr[mid] > x){
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
        int[] arr = {3, 5, 8, 9, 15, 19};
        int n = 9;
        int ind = upperBound(arr,  n);
        System.out.println("The upper bound is the index: " + ind);
    }
}
