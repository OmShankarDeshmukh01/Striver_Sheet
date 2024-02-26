package SOLVE_PROBLEMS_ON_ARRAYS.EASY;

import java.util.Arrays;

public class Rotate_Array_189 {
    public static void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;
        if( n == 1){
            System.out.println(Arrays.toString(nums));
        } 
        int temp [] = new int[n-k];
        for(int i = 0 ;i<n-k ;i++){
            temp[i] = nums[i];
        }
        for(int i = n-k ;i<n;i++){
            nums[i-(n-k)]= nums[i];
        }
        for(int i = n-(n-k) ; i < n ;i++){
            nums[i] = temp[i-(n-(n-k))];
        }
        System.out.println(Arrays.toString(nums));
    }
}
