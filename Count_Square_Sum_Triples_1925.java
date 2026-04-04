package DSA;

import java.util.HashSet;
import java.util.Set;

public class Count_Square_Sum_Triples_1925 {
    public static void main(String args[]){
        int n=5;
    int arr[]=new int[n+1];
  Set<Integer> square=new HashSet<>();
        for (int i=1; i<=n; i++){
            square.add(i*i);
        }
        int count=0;
        for (final  int a:square){
            for (final int b:square){
                if (square.contains(a+b)){
                    count++;
                }
            }
        }
        System.out.println(count);

//         this is also a solutions

//        int count=0;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                int ij = i*i + j*j;
//                int k = (int) Math.sqrt(ij);
//
//                if(k<=n && k*k==ij) count++;
//            }
//        }


    }
}
