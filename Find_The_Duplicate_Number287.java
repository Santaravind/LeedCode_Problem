package DSA;

import java.util.Arrays;

public class Find_The_Duplicate_Number287 {
    public static void main(String args[]){
//        int nums[]={1,2,3,2,4};
//        int nums[]={3,1,3,4,2};
//        int nums[]={3,3,3,3};
        int nums[]={7,9,7,4,2,8,7,7,1,5};
        Arrays.sort(nums);
        int n=nums.length;
        //optimse solution
        boolean[] visited = new boolean[nums.length + 1];
        for (int x : nums) {
            if (visited[x]) {
                System.out.println("Dublicate value"+x);
            }
            visited[x] = true;
        }

//        test case 29/59
//        for (int i=0; i<n; i++){
//            if((i+1)!=nums[i]){
//                System.out.println("Dublicate value"+nums[i]);
//                break;
//            }
//        }
//        all test case pass but take too much time
      for (int i=0; i<n-1; i++){
          if(nums[i]==nums[i+1]){
              System.out.println(nums[i+1]);
              break;
          }
      }


    }
}
