package DSA.GFG;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Allocate_Minimum_Pages {
    public static void main(String args[]){
//         int arr[]={12, 34, 67, 90};
//        int k=2;
//        int arr[]={15,17,20};
        int arr[]={15, 10, 19, 10, 5, 18, 7};
        int k=5;
//        Arrays.sort(arr);
         int start=0;
         int end=0;
         for(int i=0; i<arr.length; i++){
             end+=arr[i];
//             start=Math.max(start,arr[i]);
         }
        System.out.println(start);

         int result=-1;
         int n=arr.length;
         if (k>n){
//             return result;
             System.out.println(result);
             return;
         }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(arr,n,k,mid)==true) {
                result = mid;
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        System.out.println(result);

    }
    public static boolean isValid(int arr[], int n, int k, int max){

          int st=1;
          int sum=0;

          for (int i=0; i<n; i++){
              sum+=arr[i];
              if (sum>max){
                  st++;
              }
              if (st>k){
                  return false;
              }
          }

        return  true;
    }
}
