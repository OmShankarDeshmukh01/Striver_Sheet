import java.util.*;
public class Aggressive_cows {
    public static boolean canWeplace(int stall[] , int dist , int cows){
        int n =stall.length; //size of array
        int cowCnt =1; //number of cows placed
        int last = stall[0]; //position of last pplaced cow.
        for(int i=1;i< n;i++){
            //checking the conditon to place new cow
            if(stall[i] - last >= dist){
                cowCnt++; //place new cow
                last = stall[i]; //update the last postion
            }
            //cows placed is equal or greater to the required cows
            if( cowCnt >= cows){
                return true;
            }
        }
        return false;

    }
    public static int aggressiveCows(int[] stalls, int k) {
        //size of an array
        int n =stalls.length;
        //sorth the array
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[n-1] - stalls[0];
        while(start <= end){
            int mid = (start + end)/2;
            if(canWeplace(stalls , mid ,k) == true){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end;
        

    }
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}
