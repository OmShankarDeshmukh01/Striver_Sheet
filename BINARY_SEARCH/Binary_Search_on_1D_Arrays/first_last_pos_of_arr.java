
import java.util.*;
public class first_last_pos_of_arr {
    static int firstele(int arr[] , int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int first = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                first = mid; // we got the element now to get the first element we need to search in the left 
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return first;
    }
    static int lastele(int arr[] , int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int second = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                second = mid; // we got the element now to get the last element we need to search in the right 
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return second;
    }
    public static int[] searchRange(int[] arr, int x) {
        int f = firstele(arr, x);
        int s = lastele(arr, x);
        return new int[] {f, s};
    }
    public static void main(String[] args) {
        int[] arr = {};
        int x = 6;
        int ind[] = searchRange(arr, x);
        System.out.println(Arrays.toString(ind));
    }

}
