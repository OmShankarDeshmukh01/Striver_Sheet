public class Capacity_To_Ship_Packages_Within_D_Days {
    public static int maxcapacity(int arr[]){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int maxdays(int arr[]){
        int sum = 0;
        int n = arr.length;
        for(int i =0 ;i< n;i++ ){
            sum += arr[i];
        }  
        return sum;
    }
    public static int findDays(int[] weights, int cap) {
        int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }
    public  static int shipWithinDays(int[] weights, int days) {
        int start = maxcapacity(weights);
        int end = maxdays(weights);
        while(start <= end){
            int mid = (start + end)/2;
            int totdays =  findDays(weights, mid);

            if(totdays <= days){
                //eliminate right half
                end = mid-1;
            }
            else{
                //eliminate left half
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        System.out.println(maxcapacity(weights));
        System.out.println(maxdays(weights));
        int ans = shipWithinDays(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
