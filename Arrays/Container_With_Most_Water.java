package DSA.Arrays;

public class Container_With_Most_Water {
    public static void main(String arg[]){
        int arr[]={8,6,2,5,4,8,3,7};
//        given heights[]
//        left  ← 0
//        right ← n − 1; max ← 0
//        while left < right:
//        area = (right − left) × min(h[left], h[right])
//        max ← max(max, area)
//        if h[left] ≤ h[right] → left++
//    else                  → right−−
//        return max

        int left=0;
        int right=arr.length-1;
        int max=0;
        while (left<right){
            int area=(right-left)*Math.min(arr[left],arr[right]);
            max=Math.max(max,area);

            if (arr[left]<=arr[right]) left++;
            else right--;
        }

        System.out.println(max);
    }
}
