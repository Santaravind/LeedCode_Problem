package DSA.Arrays;

public class Rotate_Array_189 {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7};
        int k=8;
//        int n=nums.length-1;
//        int x=0;
//        while(k>0){
//           x=nums[n];
//           for (int i=nums.length-1; i>0;  i--){
//
//                nums[i]=nums[i-1];
//           }
//           nums[0]=x;
//
//           k--;
//        }
        rotate(nums,k);

        for (int val:nums){
            System.out.print(val+" ");
        }
    }

    public static  void rotate(int nums[], int k){
        k=k%nums.length;
        int n=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static  void reverse(int nums[], int start, int end){

        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
