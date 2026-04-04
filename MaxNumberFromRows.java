package DSA;
import java.util.*;

public class MaxNumberFromRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of rows
        int n = scanner.nextInt();

        // Read number of columns
        int m = scanner.nextInt();

        // Read the matrix
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Step 1: Concatenate each row into a string
        String[] rowStrings = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder rowConcat = new StringBuilder();
            for (int j = 0; j < m; j++) {
                rowConcat.append(matrix[i][j]);
            }
            rowStrings[i] = rowConcat.toString();
        }

        // Step 2: Sort row strings in descending order
        Arrays.sort(rowStrings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // For descending order, compare b with a
                return b.compareTo(a);
            }
        });


        StringBuilder result = new StringBuilder();
        for (String rowStr : rowStrings) {
            result.append(rowStr);
        }

        // Output the final largest number
        System.out.println(result.toString());

        scanner.close();
    }
}