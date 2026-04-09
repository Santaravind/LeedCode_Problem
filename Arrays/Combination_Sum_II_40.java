package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//this is the backtracking problem
public class Combination_Sum_II_40 {
    public static void sovle(int [] arr, int target, List<Integer>curr,List<List<Integer>>result, int idx){
        if (target<0){
            return;
        }
        if (target==0){
             result.add(new ArrayList<>(curr));
             return;
        }

        for (int i=idx; i<arr.length; i++){
            if (i>idx&&arr[i]==arr[i-1]){
                continue;
            }
            curr.add(arr[i]);//do
            sovle(arr,target-arr[i],curr,result,i+1);//explore
            curr.remove(curr.size()-1);//undo
}

    }
    public static void main(String args[]){
        int arr[]={10,1,2,7,6,1,5};
        int target=8;

        List<List<Integer>> result=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        Arrays.sort(arr);
        sovle(arr,target,curr,result,0 );

        System.out.println(result);

    }
}
