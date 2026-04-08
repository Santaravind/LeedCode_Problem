package DSA.BinarySearch;

public class Search_in_Rotated_Sorted_array_II_81 {
    public static void main(String args[]){
        int arr[]={2,5,4,0,0,1,2};
//        int arr[]={1,0,1,1,1};
        int target=1;

        int start =0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==target){
                System.out.println(true);
                break;
            }
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                start++;
                end--;
                continue;
            }
            if (arr[mid]<target){
                if (target<arr[mid]&&target>=arr[start]) {
                    end = mid - 1;
                }else start =mid+1;

            } else if (arr[mid]>target) {
                if (arr[end]>=target&& target>arr[mid]){
                    start=mid+1;
                }else  end=mid-1;

            }
        }

        System.out.println(false);
    }
}
