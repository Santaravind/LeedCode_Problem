package DSA.Arrays;

import java.util.Arrays;

public class Minimum_Cost_of_Buying_Candies_With_Discount_2144 {
    public  static void main(String args[]){
//        int arr[]={1,2,3};
        int arr[]={6,5,7,9,2,2};
//
//        This solution take 6ms
        Arrays.sort(arr);
//          int cost=0,count=0;
//        for (int i=arr.length-1; i>=0; i--){
//
//              if (count==2){
//                  count=0;
//                  continue;
//              }
//
//              count++;
//              cost+=arr[i];
//
//
//        }
//        System.out.println(cost);
         int i=arr.length-1;
         int price=0;
         while(i>1){
             price+=arr[i--];
             price+=arr[i--];
             i--;
         }
         if (i>=0){
             price+=arr[i--];
         }

        System.out.println(price);
    }
}
