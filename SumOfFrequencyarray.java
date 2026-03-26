package DSA;

import java.util.Arrays;
import java.util.LinkedList;

public class SumOfFrequencyarray {
    public static  void main(String args []){
        int a[]={10,1,2,9,3,3,3,3,5};
        Arrays.sort(a);
          int k=a.length;
          int f[]=new int[k+1];
       for (int i=0; i<a.length-1; i++){
                  f[a[i]]++;
                    }
       for (int i=0; i<f.length; i++){
           System.out.print((i*f[i])+" ");
       }
    }
}
