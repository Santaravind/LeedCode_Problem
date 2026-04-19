package DSA.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {
    public static int maxProfit(int nums[]){


        int ans=0;
        for (int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                ans+=nums[i]-nums[i-1];
            }
        }


        return ans;
    }
    public static  void main(String args[]){
//        int nums[]={7,1,5,3,6,4};
//        int nums[]={7,6,4,3,1};
        int nums[]={1,2,3,4,5};


        System.out.println(maxProfit(nums));
    }
}
