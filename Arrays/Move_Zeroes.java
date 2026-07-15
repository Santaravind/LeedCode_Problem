package DSA.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
//        int arr[]={0,1,0,0,12,0,0,3};
        int arr[]={1,0};


        //this is the sudo code /algo
//        given arr
//        slow ← 0
//        for fast ← 0 to n − 1:
//        if arr[fast] ≠ 0:
//        swap(arr[slow], arr[fast])
//        slow++

        int left=0;
        int right=0;
   for ( right =0; right<arr.length; right++){
            if (arr[right]!=0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }

//        int slow=0;
//        for (int fast=0 ;fast<arr.length; fast++){
//            if (arr[fast]!=0){
//                int temp=arr[fast];
//                arr[fast]=arr[slow];
//                arr[slow]=temp;
//                slow++;
//            }
//        }
        for (int v: arr){
            System.out.print(v + " ");
        }
    }
}
