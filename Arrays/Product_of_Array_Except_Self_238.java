package DSA.Arrays;

public class Product_of_Array_Except_Self_238 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
//        int nums[]={-1,1,0,-3,3};
//        output =[24,12,8,6]

//        Input: nums = [-1,1,0,-3,3]
//        Output: [0,0,9,0,0]

        int ans[]=new int[nums.length];

        int totalM=1;
        int prefix=1;
        int sufix=1;
//        for (int v:nums){
//            totalM=totalM*v;
//        }
////        System.out.println(totalM);
//
//        for (int i=0;i<nums.length; i++){
//            prefix=nums[i];
//            System.out.println(i+" "+ prefix);
////           totalM-=prefix;
////            System.out.println(i+ " "+totalM);
//        }
//        System.out.println(prefix+ " "+totalM);

//        for (int b: sum){
//            System.out.print(b+" ");
//        }

        for (int i=0; i< nums.length; i++){
            ans[i]=prefix;
            prefix*=nums[i];
        }
        for (int i=nums.length - 1; i>=0; i--){
            ans[i]*=sufix;
            sufix*=nums[i];
        }
        for (int v:ans){
            System.out.print(v+" ");
        }
    }
}
