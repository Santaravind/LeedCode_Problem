package DSA.String;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_the_Kth_Largest_Integer_the_Array_1985 {
    public  static  String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(Collections.reverseOrder());

         for (String n:nums){
             int x=Integer.valueOf(n);
             if (minHeap.size()>k){
                 minHeap.poll();
             }
             minHeap.offer(x);
         }
         while (k!=1){
             minHeap.poll();
             k--;
         }
        return String.valueOf(minHeap.peek());
    }
    public static void main(String args[]){
//         String num[]={"3","6","7","10"};
//         int k =4;
       String num[]={"2","21","12","1"};
       int k = 3;
        System.out.println(kthLargestNumber(num, k));
    }
}
