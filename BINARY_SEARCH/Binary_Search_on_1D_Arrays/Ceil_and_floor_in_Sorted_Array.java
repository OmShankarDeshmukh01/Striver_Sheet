package BINARY_SEARCH.Binary_Search_on_1D_Arrays;

public class Ceil_and_floor_in_Sorted_Array {
    //arr[n] <= x //floor
    static int findFloor(int[] arr, int x) {
        int n=arr.length;
        int start =0 ;
        int end = n-1;
        int ans = -1;
        while( start <= end){
            int mid = ( start + end)/2;

            if(arr[mid] <= x){
                ans =arr[mid];
                start = mid +1;
                
            }
            else{
                end = mid-1;
                
            }
        }
        return ans;
    }
    //arr[n] >= x  //ceil or lower bound
    static int findCeil(int[] arr, int x) {
        int n=arr.length;
        int start =0 ;
        int end = n-1;
        int ans = -1;
        while( start <= end){
            int mid = ( start + end)/2;

            if(arr[mid] >= x){
                ans =arr[mid];
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static int[] getFloorAndCeil(int[] arr, int x) {
        int f = findFloor(arr, x);
        int c = findCeil(arr, x);
        return new int[] {f, c};
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] ans = getFloorAndCeil(arr, x);
        System.out.println("The floor and ceil are: " + ans[0]
                           + " " + ans[1]);
    }
}
