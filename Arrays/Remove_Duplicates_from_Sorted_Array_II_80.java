package DSA.Arrays;

public class Remove_Duplicates_from_Sorted_Array_II_80 {
    public static void main(String args[]){
        int arr[]={0,0,1,1,1,1,2,3,3};
//        int arr[]={1,1,1,2,2,3};
        int n=arr.length;
        int start =2;
        for (int i=2; i<arr.length; i++){
            if (arr[i]!=arr[start-2]){
                arr[start++]=arr[i];
            }
        }
        System.out.println(start);
        for (int val:arr){
            System.out.print(val+" ");
        }

    }
}
