package DSA.Arrays;

public class Rotate_Function_396 {
    public static void main(String args[]){
        int arr[]={4,3,2,6};
        int j=0;
//        while(j<=3) {
//            int r = arr[arr.length - 1];
//            for (int i = 3; i > 0; i--) {
//
//                arr[i] = arr[i - 1];
//            }
//            arr[0] = r;
//
//
//
//            j++;
//        }

         int sum=0;
         int fsum=0;
         int n=arr.length;

         for (int i=0; i<n; i++){
             sum +=arr[i];
             fsum =fsum+i*arr[i];
         }
        int max=fsum;
         for (int i=1; i<n; i++){
              fsum=fsum+sum-n*arr[n-i];
              max=Math.max(fsum,max);

         }

        System.out.println(max);


//        for (int x:arr){
//            System.out.println(x);
//        }
    }
}
