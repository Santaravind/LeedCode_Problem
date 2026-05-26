package DSA.Arrays;

public class Search_a_2D_Matrix_74 {
    public static  void main(String args[]){
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int n=arr.length;
        int m=arr[0].length;
        int target=4;
        System.out.println(n+" "+m);
        int i=0;
        int j=m-1;
        while(i>=0&&i<n &&j>=0&&j<m){
            if (arr[i][j]==target) {
                System.out.println(true);
            } else if (arr[i][j]>target) {
                j--;
            } else if (arr[i][j]<target) {
                i++;
            }
        }
        System.out.println("Target not exist");
    }
}
