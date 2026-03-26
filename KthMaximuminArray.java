package DSA;

import java.util.Arrays;

public class KthMaximuminArray {
    public  static void main(String args[]){

        Integer arr[]={3,2,3,1,2,4,5,5,6};

        int k=2;
        Arrays.sort(arr);
        //Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[arr.length-k]);


//        int a=90;
//        int b=90;
//        int mult=a*b;
//        System.out.println(mult);
//        Scanner sc =new Scanner(System.in);
////        sc.nextInt();

    }
}
