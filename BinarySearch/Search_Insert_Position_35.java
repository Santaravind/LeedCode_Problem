package DSA.BinarySearch;

public class Search_Insert_Position_35 {
    public static void main(String args[]){

//        int nums[]={1,3,5,6};
        int nums[]={1,3,5,6};
        int target=2;
        int start=0;
        int end=nums.length-1;
//        int n=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;

        if(nums[mid]==target){

            System.out.println(mid);
        }
        if(nums[mid]>target){

            end=mid-1;
        }else if (nums[mid]<target){

             start=mid+1;
            }

        }
        System.out.println( start);
    }
}
