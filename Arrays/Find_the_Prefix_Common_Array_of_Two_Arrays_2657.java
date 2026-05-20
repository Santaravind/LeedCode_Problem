package DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Find_the_Prefix_Common_Array_of_Two_Arrays_2657 {
    public static void main(String arg[]){
        int a[]={1,3,2,4};
        int b[]={3,1,2,4};

        int n=a.length;
        Set<Integer> sets=new HashSet<>();
        int c[]=new  int[n];
        int count=0;
        for (int i=0; i<n; i++){
            if (sets.contains(a[i])){
                count++;
            }else {
                sets.add(a[i]);
            }
            if(sets.contains(b[i])){
                count++;
            }else {
                sets.add(b[i]);
            }
            c[i]=count;
        }

        for (int val:c){
            System.out.print(val);
        }
        System.out.println();
    }
}
