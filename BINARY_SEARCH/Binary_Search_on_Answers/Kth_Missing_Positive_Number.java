public class Kth_Missing_Positive_Number {
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid =(start + end)/2;
            //missing numbers
            int missing = arr[mid] - (mid+1);
            if(missing < k){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        //formula for getting the missing numbers
        return end+1+k;
    }
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int k = 4;
        int ans = findKthPositive(vec,  k);
        System.out.println("The missing number is: " + ans);
    }
}
