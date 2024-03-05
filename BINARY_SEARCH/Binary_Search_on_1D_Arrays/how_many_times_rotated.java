public class how_many_times_rotated{
    //wrong code please do not copy
public static int findKRotation(int []arr){
        int start =0;
        int end =arr.length -1;
        int temp = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] < temp){
                temp ++;
                end = mid-1;
            }
            else{
                start = mid+1;
                temp++;
            }
        }
        return temp;
}
public static void main(String[] args) {
    int arr[] = {1, 2 ,3};
    System.out.println(findKRotation(arr));
}
}