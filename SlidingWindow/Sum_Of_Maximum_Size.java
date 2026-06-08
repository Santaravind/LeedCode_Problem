package DSA.SlidingWindow;

import java.util.Arrays;

public class Sum_Of_Maximum_Size {
    public static void main(String[] args) {
       int arr[]={2,4,5,6,9,7,8,9,9};
       int size=3;
       int i=0;
       int j=0;
       int sum=0;
       int Max=Integer.MIN_VALUE;

       while (j< arr.length){
           sum+=arr[j];
           if ((j-i+1)<size){
               j++;
           }else if ((j-i+1)==size){
               Max=Math.max(sum,Max);
               sum-=arr[i];
               j++;
               i++;

           }



       }

        System.out.println(Max);

    }
}
