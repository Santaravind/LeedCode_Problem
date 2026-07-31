package DSA.Heap;

import java.util.PriorityQueue;

public class K_Closest_Points_to_Origin_973 {
//    given points, k
//    heap = empty max-heap on dist²
//            for p in points:
//            if heap.size < k: push p
//    else if dist(p) < heap.top:
//    pop the farthest …
//            … and push p
//    else: skip
//return heap contents
private  static  int distSq(int[] p) {
    return p[0] * p[0] + p[1] * p[1];
}
    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {-2, 2}};
        int k = 1;
//        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        int dist;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(distSq(b), distSq(a))
        );
        for (int v[] : arr) {

            if (maxHeap.size() < k) {
                maxHeap.offer(v);
            }else if(distSq(v)<distSq(maxHeap.peek())){
                maxHeap.poll();
                maxHeap.offer(v);
            }
        }

        int[][] result = new int[k][2];
        int index = 0;
        while (!maxHeap.isEmpty()) {
            result[index++] = maxHeap.poll();
        }

        for (int v[]:result){
            System.out.println(v[0]);
        }

    }
}
