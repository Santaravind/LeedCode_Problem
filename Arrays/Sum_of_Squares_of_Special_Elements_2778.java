package DSA.Arrays;

public class Sum_of_Squares_of_Special_Elements_2778 {
    public  static  int sumOfSquares(int[] nums) {

           int sum=0;
           int n=nums.length;
           for (int i=0; i<n; i++){
               if (n%(i+1)==0){
                   sum+=nums[i]*nums[i];
               }
           }


        return sum;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4};
//        int arr[]={2,7,1,19,18,3};
        System.out.println(sumOfSquares(arr));
    }
}
