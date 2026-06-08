package DSA.Arrays;

public class Partition_Array_According_to_Given_Pivot_2161 {
//    public  static int arrayPivod(int arr[],int pivod){
//        int j=arr.length-1;
//        int i=0;
//        int temp=0;
//        while(i<j){
//            do{
//                i++;
//            }while (arr[i]<pivod);
//            do{
//                j--;
//            }while (arr[j]>pivod);
//
//            if (i<j){
//                temp=j;
//                j=i;
//                i=temp;
//            }
//        }
//
//
//        return j;
//    }
    public static void main(String[] args) {
        int arr[]={9,12,5,10,14,3,10};
        int pivot=10;
        int n=arr.length;
        int left=0, right=n-1;
        int a[]=new int[n];

        for (int i=0; i<n; i++){
            if (arr[i]<pivot){
                a[left++]=arr[i];
            }
        }
        for (int i=n-1; i>=0; i--){
            if (arr[i]>pivot){
                a[right--]=arr[i];
            }
        }

        while (left<=right){
            a[left++]=pivot;
        }

        for (int m: a){
            System.out.print(m+" ");
        }



    }
}
