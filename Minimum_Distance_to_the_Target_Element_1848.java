package DSA;

public class Minimum_Distance_to_the_Target_Element_1848 {
    public static int getMinDistance(int[] nums, int target, int start) {
                int result=Integer.MAX_VALUE;
           for (int i=0; i<nums.length; i++){
               if(nums[i]==target){
                   result=Math.min(result,Math.abs(i-start));
               }
           }
        return  result;
    }
    public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
         int arr[]={1,1,1,1,1,1,1,1,1,1};
//         int target=5;
         int target=1;
         int start=0;
         int result=getMinDistance(arr,target,start);
        System.out.println("Result : " +  result);
    }
}
