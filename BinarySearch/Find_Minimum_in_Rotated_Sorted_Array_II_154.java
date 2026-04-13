package DSA.BinarySearch;

public class Find_Minimum_in_Rotated_Sorted_Array_II_154 {
    public static void main(String args[]){
        int arr[]={2,2,2,0,1};
//        int arr[]={1,3,5};
        int n=arr.length;
        int start=0;
        int end=arr.length-1;
         while(start<=end){
             int mid=start+(end-start)/2;
              if (arr[mid]>arr[end]){
                  start=mid+1;
              }else if(arr[mid]<arr[end]){
                  end=mid;
              }else{
                  end--;
              }
         }
        System.out.println(arr[start]);
    }
}
