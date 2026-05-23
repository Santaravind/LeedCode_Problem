package DSA.Arrays;

public class Check_The_Array_Sorted_Roteted_1752
{
    public static boolean CheckSortedRoted(int nums[]){

        int index=-1;

        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                if(index==-1)
                    index=i;
                else return false;
            }
        }

        if(index==-1){
            return true;
        }
        if(nums[0]>=nums[nums.length-1])
            return true;
        else return false;



//        return true;
    }
    public static void main(String args[]){
//        int nums[]={3,4,5,6,1,2};
        int nums[]={2,1,3,4};
        System.out.println(CheckSortedRoted(nums));
    }
}
