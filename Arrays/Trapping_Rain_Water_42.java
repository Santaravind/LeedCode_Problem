package DSA.Arrays;

public class Trapping_Rain_Water_42 {
//    given h[]
//    left ← 0; right ← n − 1
//    leftMax ← 0; rightMax ← 0; total ← 0
//            while left < right:
//            if h[left] < h[right]:
//            if h[left] ≥ leftMax: leftMax = h[left]
//            else: total += leftMax − h[left]
//    left++
//            else:
//            if h[right] ≥ rightMax: rightMax = h[right]
//            else: total += rightMax − h[right]
//    right−−
//            return total
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        int left=0;
        int right=height.length-1;
       int   leftMax=Integer.MIN_VALUE;
       int   rightMax=Integer.MIN_VALUE;
       int total=0;
       while (left<right){
           if (height[left]<height[right]){
               if (height[left]>=leftMax){
                   leftMax=height[left];
               }else {
                   total+=leftMax-height[left];
               }
               left++;
           }else {
               if (height[right]>=rightMax){
                   rightMax=height[right];
               }else {
                   total+=rightMax-height[right];
               }
               right --;
           }

       }

        System.out.println(total);
    }
}
