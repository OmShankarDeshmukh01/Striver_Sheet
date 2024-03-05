package BINARY_SEARCH.Binary_Search_on_1D_Arrays;
import java.util.*;
public class Number_of_occurrence {
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
    public static int[] firstandlastpos(int[] arr, int x) {
        int f = firstele(arr, x);
        if(f == -1){
            return new int[]{-1 ,-1};
        }
        int s = lastele(arr, x);
        return new int[] {f, s};
    }
    public static int count(int arr[],  int x) {
        int ans[] = firstandlastpos( arr,  x);
        if(ans[0] == -1){
            return 0;
        }
        return ((arr[1] - arr[0])+1 ); // maths formula to get the nums of occurance
    }
    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int  x = 8;
        int ans = count(arr,  x);
        System.out.println("The number of occurrences is: " + ans);
    }
}
