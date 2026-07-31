package DSA.Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class K_Closest_Number {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=4;
        int x=3;
//        PriorityQueue<int []>maxHeap=new PriorityQueue<>();

        int l=0;
        int r=arr.length-k;
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(x-arr[mid]>arr[mid+k]-x)
            {
                l=mid+1;
            }
            else
            {
                r=mid;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=l;i<l+k;i++)
        {
            ans.add(arr[i]);
        }

        System.out.println(ans);
    }
}
