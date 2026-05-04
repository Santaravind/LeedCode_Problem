package DSA.Arrays;

public class RotateImage_48 {
    public static void main(String srg[]){
        int [][]max={{1,2,3},{4,5,6},{7,8,9}};
        int n= max.length;
        System.out.println(n);
           for (int i=0; i<(n+1)/2; i++){
               for (int j=0;j<n/2; j++){
                   int temp=max[n-1-j][i];
                   max[n-1-j][i]=max[n-1-i][n-1-j];
                   max[n-1-i][n-1-j]=max[j][n-1-i];
                   max[j][n-1-i]=max[i][j];
                   max[i][j]=temp;
               }
                   }

           for (int x=0; x<n;  x++){
               for (int i=0;i<n; i++){
                   System.out.print(max[x][i] + " ");
               }
               System.out.println(" ");
           }


    }
}
