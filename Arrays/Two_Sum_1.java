package DSA.Arrays;

public class Two_Sum_1 {
    public static void main(String args[]){
//        int nums[]={2,7,11,15};
//        int nums[]={3,2,4};
//        int nums[]={3,3};
//        int left=0;
//        int target=6;
//        int n=nums.length-1;
//        int right=n;
//        while(left<=n||right>=0){
//            if(nums[left]+nums[right]==target){
////                return[left,right];
//                System.out.println(left+" "+right);
//                break;
//            }
//                if (nums[right] > target) {
//                    right--;
//                } else {
//                    left++;
//                }
//
//        }
        int nums[]={2,7,11,15};
        int target=9;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
//                     return new int[]{i,j};
                    System.out.println(i+ " "+j);
                }
            }
        }

    }
}
