package DSA.Arrays;

public class Rotate_Arrays_189 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=4;
        int n=arr.length;
        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
        for (int v:arr){
            System.out.print(v+" ");
        }
    }
    public static  void rotate(int arr[],int start, int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
}
