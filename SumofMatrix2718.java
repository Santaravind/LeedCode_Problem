package DSA;

import java.util.Scanner;

public class SumofMatrix2718 {
    public static  void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix size of nXn :-");
        n=sc.nextInt();

        int num[][]=new int[n][n];
        int type, index, value;
        System.out.println("How may query you want perform");
        int query=sc.nextInt();
        int i=0;
        while (i<query){
        System.out.println("Enter the query type , index, value");
        type=sc.nextInt();
        index=sc.nextInt();
        value=sc.nextInt();

          if (type==0){
              for (int j=0; j<n; j++){
                  num[j][index]=value;
              }
          }else {
              for (int j=0; j<n; j++){
                  num[index][j]=value;
              }
          }
          i++;
        }
        int sum=0;
        for (int k=0; k<n; k++){
            for (int j=0; j<n; j++){
                sum+=num[k][j];
            }
        }

        System.out.println("Sum ="+sum);



    }
}
