package SOLVE_PROBLEMS_ON_ARRAYS.EASY;

public class Missing_Number_268 {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }
        
        return res;       
    }
}
