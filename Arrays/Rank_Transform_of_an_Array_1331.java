package DSA.Arrays;

import java.util.*;

public class Rank_Transform_of_an_Array_1331 {
    public static void main(String args[]){
//        int arr[]={40,10,20,30};
        int arr[]={37,12,28,9,100,56,80,5,12};
        int nums[]=arr.clone();
        Arrays.sort(nums);
        int k=1;
        HashMap<Integer, Integer>map=new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                  continue;
            }else {
               map.put(nums[i],k);
               k++;
            }
        }
        int ans[]=new int[arr.length];
        System.out.println(map);
        for (int n=0; n<arr.length; n++){
           ans[n]=map.get(arr[n]);
        }


        for (int n: ans) {
            System.out.print(n+ " ");
        }
    }
}
