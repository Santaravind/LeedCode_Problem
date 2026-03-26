package DSA;

import javax.swing.text.html.StyleSheet;
import java.util.Arrays;
import java.util.Scanner;

public class FindMessingValueInArray {
    public static void main(String args []){
        int arr[]=new int[9];
        int count=0;
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Array");
        for (int i=0; i<9; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter value of k ");
        k=sc.nextInt();
        int m=0;
        int ar[]=new int[arr.length];
        Arrays.sort(arr);
        int x=arr[arr.length-1];
        for (int i=1; i<=x; i++){
            for (int j=0; j<9;j++){
                if ((k*i)==arr[j]){
                    ar[m++]=arr[j];
                }
            }
        }
//        for (int v:ar){
//            System.out.println(v);
//        }
        Arrays.sort(ar);
        int i;
        int j=1;
        for ( i=0; i<ar.length; i++){
            System.out.print(j);
            if ((k*j)!=ar[i]){

                break;
            }
            j++;
        }
        System.out.println(k*(j+1));



    }
}
