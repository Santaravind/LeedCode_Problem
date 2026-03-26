package DSA;
//dayproblem of 21/03/2026
public class MatrixFlip {
    public static  void main(String args[]){
        int grid[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
                int l=grid.length;
                int c=grid[0].length;

                int k=3;
                int m=0;
                int top=1,bottom=1+k-1;
                while (top<bottom){
                    for (int j=m;j<m+k; j++){
                        int temp=grid[top][j];
                        grid[top][j]=grid[bottom][j];
                        grid[bottom][j]=temp;
                    }
                    top++;
                    bottom--;
                }
                for (int i=0; i<grid.length; i++){
                    for (int j=0; j<grid[0].length; j++){
                        System.out.print(grid[i][j]+" ");
                    }
                    System.out.println(" ");
                }
    }
}
