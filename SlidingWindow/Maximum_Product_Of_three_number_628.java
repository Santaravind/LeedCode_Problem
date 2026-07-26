package DSA.SlidingWindow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Maximum_Product_Of_three_number_628 {
    public static void main(String args[]){
//        int arr[]={1,2,3};
//        int arr[]={-1,-2,-3};
         int nums[]={-100,-2,-3,1};
//        Arrays.sort(arr);
//        int max=Integer.MIN_VALUE;
        int mult=1;


  //it will take 606 ms
//        for (int i=0;i<arr.length; i++){
//            int start=i+1;
//            int end=arr.length-1;
//            while (start<end){
//                int m=arr[i]*arr[start]*arr[end];
//                max=Math.max(max,m);
//                start++;
//                end--;
//            }
//        }

        //it will take 2ms 
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int num:nums){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }else if(num>max2){
                max3=max2;
                max2=num;
            }else if(num>max3){
                max3=num;
            }

            if(num<min1){
                min2=min1;
                min1=num;
            }else if(num<min2){
                min2=num;
            }
        }

        int max= Math.max(max1*max2*max3,max1*min1*min2);
        System.out.println(max);
    }
}
