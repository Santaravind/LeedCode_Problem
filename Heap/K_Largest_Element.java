package DSA.Heap;

import java.util.PriorityQueue;

public class K_Largest_Element {
    public static void main(String[] args) {
        int arr[]={4,6,4,2,7,89,43,2,90};
        int k=3;
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for (int num:arr){
            minHeap.offer(num);
            if (minHeap.size()>k){
                minHeap.poll();
            }
        }

        System.out.println(minHeap);
    }
}
