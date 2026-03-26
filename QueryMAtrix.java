package DSA;

import java.sql.SQLOutput;
public class QueryMAtrix {
    public static void main(String args[]) {

        int query[][] = {{0,0,1},{1,2,2},{0,2,3},{1,0,4}};
        int type = 0, index = 0, val = 0;

        int row = query.length;

        int j = 0;

        while (j < row) {

            for (int i = 0; i < 3; i++) {

                if (i == 0) {
                    type = query[j][i];
                }
                else if (i == 1) {
                    index = query[j][i];
                }
                else {
                    val = query[j][i];
                }
            }

            System.out.println(type + " " + index + " " + val);
            j++;
        }
    }
}
//class Solution {
//    public long matrixSumQueries(int n, int[][] queries) {
//
//        long row = n;
//        long column = n;
//        long sum = 0;
//
//        boolean[] rowv = new boolean[n];
//        boolean[] colv = new boolean[n];
//
//        for (int i = queries.length - 1; i >= 0; i--) {
//
//            int type = queries[i][0];
//            int index = queries[i][1];
//            int value = queries[i][2];
//
//            if (type == 0 && !rowv[index]) {
//                sum += column * value;
//                rowv[index] = true;
//                row--;
//            }
//
//            if (type == 1 && !colv[index]) {
//                sum += row * value;
//                colv[index] = true;
//                column--;
//            }
//        }
//
//        return sum;
//    }
//}