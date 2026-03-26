package DSA;
//
//You are given an m x n matrix grid of positive integers. Your task is to determine if
// it is possible to make either one horizontal or one vertical cut on the grid such that:
//
//Each of the two resulting sections formed by the cut is non-empty.
//The sum of the elements in both sections is equal.
//Return true if such a partition exists; otherwise return false.
//
//
//
//Example 1:
//
//Input: grid = [[1,4],[2,3]]
//
//Output: true
//
//Explanation:
//
//
//
//A horizontal cut between row 0 and row 1 results in two non-empty sections,
// each with a sum of 5. Thus, the answer is true.
//
//Example 2:
//
//Input: grid = [[1,3],[2,4]]
//
//Output: false
//
//Explanation:
//
//No horizontal or vertical cut results in two non-empty sections with equal sums. Thus, the answer is false.
//
//
import java.util.Scanner;
import java.util.Vector;

public class Equal_Sum_Grid_Partition_I_3546 {
    public static void main(String args[]){
//        int nums[][]=new int[2][2];
        int nums[][]={{1,3},{2,4}};
        Vector<Integer> v=new Vector<>();
        Vector<Integer> v1=new Vector<>();
        int n=nums.length;
        int m=nums[0].length;

        int sum=0;
        Scanner sc=new Scanner(System.in);
        //taking array value;
//        System.out.println("Enter the value of array");
//        for (int i=0; i<n; i++){
//            for (int j=0; j<m; j++){
//                nums[i][j]=sc.nextInt();
//            }
//        }
//        int colsum=0;

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                sum+=nums[i][j];
//                colsum+=nums[j][i];
            }

            v.add(sum);
            System.out.println(sum);
//            v1.add(colsum);
            sum=0;
//            colsum=0;
        }

//        for (int var:v){
//            System.out.print(var+" ");
//        }
//        for (int var:v1){
//            System.out.print(var+" ");
//        }
        for(int i=0; i<(v.size())-1;i++ ){
            if ((v.get(i).equals(v.get(i+1)))){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
//       for(int i=0; i<(v1.size())-1;i++ ){
//            if (v1.get(i).equals(v1.get(i+1))){
//                System.out.println("true");
//            }else {
//                System.out.println("false");
//            }
//        }



//        class Solution {
//            public boolean canPartitionGrid(int[][] grid) {
//                // Calculate the total sum of all elements in the grid
//                long totalSum = 0;
//                for (int[] row : grid) {
//                    for (int value : row) {
//                        totalSum += value;
//                    }
//                }
//
//
//                if (totalSum % 2 != 0) {
//                    return false;
//                }
//
//                int rows = grid.length;
//                int cols = grid[0].length;
//
//                // Check if we can partition horizontally (between rows)
//                long prefixSum = 0;
//                for (int i = 0; i < rows; i++) {
//                    // Add current row sum to prefix sum
//                    for (int value : grid[i]) {
//                        prefixSum += value;
//                    }
//                    // Check if prefix sum equals half of total sum
//                    // Also ensure we're not at the last row (need at least one row on each side)
//                    if (prefixSum * 2 == totalSum && i < rows - 1) {
//                        return true;
//                    }
//                }
//
//                // Check if we can partition vertically (between columns)
//                prefixSum = 0;
//                for (int j = 0; j < cols; j++) {
//                    // Add current column sum to prefix sum
//                    for (int i = 0; i < rows; i++) {
//                        prefixSum += grid[i][j];
//                    }
//                    // Check if prefix sum equals half of total sum
//                    // Also ensure we're not at the last column (need at least one column on each side)
//                    if (prefixSum * 2 == totalSum && j < cols - 1) {
//                        return true;
//                    }
//                }
//
//                // No valid partition found
//                return false;
//            }
//        }


    }
}
