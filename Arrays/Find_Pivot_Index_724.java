package DSA.Arrays;

public class Find_Pivot_Index_724 {
    public static void main(String[] args) {
//        int nums[]={1,7,3,6,5,6};
//        int nums[]={1,2,3};
        int nums[]={2,1,-1};
         int leftSum=0;
         int rightSum=0;
         int index=-1;

         for (int v:nums){
             rightSum+=v;

         }
         for (int i=0; i<nums.length; i++){
             rightSum-=nums[i];

             if (leftSum==rightSum){
                 index=i;
                 break;
             }
             leftSum+=nums[i];
         }
        System.out.println(index);
    }
}
