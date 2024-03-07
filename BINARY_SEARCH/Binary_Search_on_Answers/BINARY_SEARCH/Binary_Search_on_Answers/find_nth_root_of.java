public class find_nth_root_of{
    public static int find(int mid ,int n , int m){
        int ans =1;
        for(int i=1;i<=n;i++){
            ans *= mid;
            if( ans > m){
                return 2;
            }
        }
        if( ans == m){
            return 1;
        }
        return 0;
    }
    public static int NthRoot(int n, int m) {
        int start =1;
        int end = m;
        while(start <= end){
            int mid = (start+end)/2;
            int ans = find(mid , n ,m);
            //if the condition matches
            if( ans == 1){
                return mid ;
            }
            else if(ans == 2){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n =4;
        int m = 69;
        System.out.println(NthRoot(n , m));
    }
}