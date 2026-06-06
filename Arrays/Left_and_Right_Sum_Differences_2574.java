package DSA.Arrays;

public class Left_and_Right_Sum_Differences_2574 {
    public static void main(String[] args) {
        int nums[]={10,4,8,3};
//        int nums[]={1};
        int result[]=new int[nums.length];

//          it will take more time
          int n=nums.length;
          int k=0;
//          while (k<n){
//              int leftSum=0;
//              int rightSum=0;
//              int i=k-1;
//              int j=k+1;
//              while (i>=0){
//                  leftSum+=nums[i];
//                  i--;
//              }
//              while (j<n){
//                  rightSum+=nums[j];
//                  j++;
//              }
//
//              result[k]=Math.abs(leftSum-rightSum);
//              k++;
//          }
        int leftSum=0;
              int rightSum=0;
        for (int v:nums){
            rightSum+=v;
        }
        for (int i=0; i<nums.length; i++){
            rightSum-=nums[i];

            result[i]=Math.abs(leftSum-rightSum);

            leftSum+=nums[i];
        }

          for (int v:result){
              System.out.print(v+ "\t");
          }
        System.out.println();



    }
}
