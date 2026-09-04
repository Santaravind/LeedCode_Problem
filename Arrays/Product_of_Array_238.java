package DSA.Arrays;

public class Product_of_Array_238 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=arr.length;
        int result[]=new int[n];
        int prefix=1;
        int suffix=1;
        for (int i=0; i<n; i++ ){
            result[i]=prefix;
            prefix*=arr[i];
        }

        for (int i=n-1; i>=0; i--){
            result[i]*=suffix;
            suffix*=arr[i];
        }

        for (int v: result){
            System.out.print(v+" ");
        }

    }
}
