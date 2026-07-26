package DSA.Arrays;

public class Maximum_Product_Subarray_152 {
    public static void main(String[] args) {
//        int nums[]={2,3,-2,4};
//        int nums[]={-2,0,-1};
        int nums[]={-2,3,-4};
//        int nums[]={0,2};
//        int nums[]={3,-1,4};
//        int currMult=nums[0];
//        int maxMult=nums[0];
//         int i=1;

//         while (i<nums.length){
//             currMult=(currMult*nums[i]);
//             if (currMult<0){
//                 int m=-1*currMult;
//                 if (m<nums[i]){
//                     currMult=nums[i];
//                 }
//             }else {
//                 if (currMult < nums[i]) {
//                     currMult = nums[i];
//                 }
//             }
//             if (currMult>maxMult){
//                 maxMult=currMult;
//             }
//             if (maxMult<nums[i]){
//             maxMult=nums[i];
//             }
//             maxMult=Math.max(currMult,maxMult);
//             i++;
//         }

        int left=1;
        int right=1;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0; i<nums.length; i++){

            left=left==0?1:left;
            right=right==0?1:right;

            left=left*nums[i];
            right=right*nums[n-1-i];

            max=Math.max(max,Math.max(left,right));

        }

        System.out.println(max);

    }
}
