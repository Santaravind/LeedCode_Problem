package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_all_unique_triplets_that_sum_to_zero {
    public static void main(String[] args) {
        int arr[] = {4, -1, -1, 0, 1, 2};

        List<List<Integer>>list=new ArrayList<>();
       for (int i=0; i<arr.length-3; i++){
           int left=i+1;
           int right=arr.length-1;
           if (i>0&&arr[i]==arr[i-1])continue;

           while (left<right){
               int sum=arr[i]+arr[left]+arr[right];
               if (sum==0){
                   list.add(Arrays.asList(arr[i],arr[left],arr[right]));
                   System.out.println(arr[i]+" "+arr[left]+" "+ arr[right]);
                   left++;
                   right--;
//                   break;
               }else if (sum<0){
                   left++;
               }else {
                   right--;
               }
           }
       }
        System.out.println(list);

    }
}
