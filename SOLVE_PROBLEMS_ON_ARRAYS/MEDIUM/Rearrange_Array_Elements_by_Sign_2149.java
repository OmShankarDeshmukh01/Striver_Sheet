public class Rearrange_Array_Elements_by_Sign_2149 {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int length = nums.length;
        int n[]  = new int[length];
        for(int num : nums){
            if(num > 0){
                n[pos] = num ;
                pos = pos+2;
            }
            else{
                n[neg] = num;
                neg = neg+2;
            }
        }
        return n ;
    }
}
