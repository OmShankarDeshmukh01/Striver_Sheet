package BINARY_SEARCH.Binary_Search_on_Answers;

public class sqrt_of_a_number {
    public static int floorSqrt(int n) {
        int start =1;
        int end =n;
        while(start <= end){
            int mid =(start+end)/2;
            int val = mid*mid;
            if(val<=n){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}
