package DSA;
//Given an array of integers nums sorted in non-decreasing order,
// find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]
//
//
//Constraints:
//
//        0 <= nums.length <= 105
//        -109 <= nums[i] <= 109
//nums is a non-decreasing array.
//        -109 <= target <= 109

//34.leeadcode
public class Find_First_Last_Position_of_Element_Sorted_Array_34 {
    public static void main(String args[]){
//        int nums[]={5,7,7,8,8,10};
      int  nums[] = {5,7,7,8,8,10};
        int target=6;
//      int nums[]={};
//      int target=9;
        int n=nums.length;
        int first=0,last=0,count=0;
        if (n<=0){
            System.out.println("[-1,-1]");
        }else {
             for (int i=0; i<n; i++){
                 if(nums[i]==target){
                     count++;
                     last=i;
                 }
             }
            if (count==0){
                System.out.println("[-1,-1]");
            }else {first =last-count+1;
            System.out.println(first+"+"+last);}
        }



    }
}
