package DSA.Arrays;

public class Longest_Subsequence_With_Non_Zero_Bitwise_XOR_3702 {
    public static void main(String[] args) {
//        int arr[]={1,2,3};
        int arr[]={0,0,0};
//        int arr[]={2,3,4};

        int xor=0;
        int count=0;

//        for (int i=1; i<arr.length; i++){
//            if ((xor^arr[i])==1){
//                 count++;
//            }else {
//                count=1;
//            }
//            xor=arr[i];
//        }

         boolean isZero=false;
        for (int v:arr){
            if (v==0){
                count++;
            }
            xor^=v;
        }
          if (count==arr.length)
            System.out.println(0);
          else if (xor!=0)
           System.out.println(arr.length);
         else if (xor==0)
             System.out.println(arr.length-1);



    }
}
