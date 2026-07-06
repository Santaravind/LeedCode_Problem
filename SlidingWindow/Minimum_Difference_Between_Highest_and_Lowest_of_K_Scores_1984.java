package DSA.SlidingWindow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores_1984 {
    public static int minimumDifference(int[] nums, int k) {
//        9,4,1,7
        int j=0;
//        int max=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
        int result=100000;
        Arrays.sort(nums);
//        while (j<nums.length){
//            max=Math.max(max,nums[j]);
//            min=Math.min(min,nums[i]);
//            if ((j-i+1)<k){
//                i++;
//            }else  if ((j-i+1)==k){
//                result=Math.min(result,(max-min));
//                j++;
//            }else if ((j-i+1)>k){
//                while ((j-i+1)>k) {
//                    min = max;
//                    max = 0;
//                    i++;
//                }
//                j++;
//            }
//        }
//        return result;
//    while (j<nums.length){
//        max=Math.max(max,nums[j]);
//
//      int  i=j+1;
//        while (i<nums.length){
//            min=Math.min(max,nums[i]);
//            result=Math.min(result,(max-min));
//            i++;
//        }
//        j++;
//    }
//    return result;

      for (int i=0; i<=nums.length-k; i++){
           int minum=(nums[i+k-1]-nums[i]);
           result=Math.min(result,minum);
      }
        return result;

    }
    public static void main(String[] args) {
//        int arr[]={90};
        int arr[]={9,4,1,7};
        int k=2;
        System.out.println(minimumDifference(arr,k));
    }
}
