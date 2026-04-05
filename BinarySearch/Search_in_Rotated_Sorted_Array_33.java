package DSA.BinarySearch;

public class Search_in_Rotated_Sorted_Array_33 {
    public static  void main(String args[]){
        int arr[]={14,15,16,1,2,3,4,5};
  int target =14;
        int start =0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
//                return mid;
                System.out.println(mid);
            }
            if(arr[start]<=arr[mid]){
                if(target<arr[mid]&&target>=arr[start]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            } else{
                if(target>arr[mid]&&target<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
//        return -1;
//        System.out.println(-1);
    }
}
