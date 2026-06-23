package DSA.Arrays;

import java.util.Arrays;

public class Maximum_Ice_Cream_Bars_1833 {
    public static void main(String[] args) {
//        Input: costs = [1,3,2,4,1], coins = 7
//        Output: 4
//        Explanation: The boy can buy ice cream bars at
//        indices 0,1,2,4 for a total
//        price of 1 + 3 + 2 + 1 = 7.
        int nums[]={1,3,2,4,1};
//        int nums[]={10,6,8,7,7,8};
//        int nums[]={1,6,3,1,2,5};
        int coins = 7;
        int count=0;
        Arrays.sort(nums);

           int sum=0;
           for (int i=0; i<nums.length;i++){
               sum+=nums[i];
               if (sum<=coins){
                   count++;
               } else if (sum>coins) {
                   sum-=nums[i];
               }
           }

        System.out.println(count);

    }
}
