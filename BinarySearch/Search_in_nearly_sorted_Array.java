package DSA.BinarySearch;

public class Search_in_nearly_sorted_Array {
    public static void main(String args[]){
        int nums[]={5,10,20 ,30,40};
        int target=40;

        int start =0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;

              if(nums[mid]==target){
                  System.out.println(mid);
                  break;
              }  if(mid-1>=start && nums[mid-1]==target){
                  System.out.println(mid-1);
                  break;
              } if(mid+1<=end&&nums[mid+1]==target){
                  System.out.println(mid+1);
                  break;
              }
              if (nums[mid]<target){
                  start=mid+2;
              }else {
                  end=mid-2;
              }


        }
        System.out.println("not found");
    }
}
