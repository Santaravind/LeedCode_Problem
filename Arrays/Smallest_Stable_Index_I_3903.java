package DSA.Arrays;

public class Smallest_Stable_Index_I_3903 {


        public static int firstStableIndex(int[] nums, int k) {
            int max=0;
            int min=0;

            for(int i=0; i<nums.length; i++){
                max=min=nums[i];
                for(int j=0; j<=i; j++){
                    max=Math.max(max,nums[j]);
                }
                for(int j=i+1; j<nums.length; j++){
                    min=Math.min(min,nums[j]);
                }
                if(max-min<=k){
                    return i;
                }
            }

            return -1;
    }
    public static void main(String[] args) {
//        int arr[]={5,0,1,4};
        int arr[]={0,1};
//        int arr[]={3,2,1};
//        int arr[]={0};
        int k=1;
        System.out.println(firstStableIndex(arr, k));
    }
}
