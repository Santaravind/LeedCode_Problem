package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Smallest_Missing_Multiple_of_K_3718 {
    public static int missingMultiple(int[] nums, int k) {
        List<Integer>list=new ArrayList<>();


        for (int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }

        for (int i=0; i<nums.length; i++){
            if (!list.contains(k*(i+1))){
                return k*(i+1);
            }
        }


        return k*(nums.length+1);
    }
    public static void main(String args[]){
//        Input: nums = [8,2,3,4,6];  k = 2
        int nums[]={2,4,6,8,10};
//        int nums[]={1,4,7,10,15};
        int k=2;
        System.out.println(missingMultiple(nums,k));
    }
}
