package DSA.String;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Lexicographical_Order {
    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String st[]=new String[s.length()-k+1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for(int i=0; i<s.length()-k+1; i++){

            st[i]=s.substring(i,i+k);
            String sub=s.substring(i,i+k);
            if (smallest.isEmpty()||sub.compareTo(smallest)<0)smallest=sub;
            if (largest.isEmpty()||sub.compareTo(largest)>0) largest=sub;
        }

        Arrays.sort(st);
        for(String v: st){
            System.out.print(v+ " ");
        }
        System.out.println("\nSmallest "+ smallest);
        System.out.println("largest  "+ largest);

//        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String s="welcometojava";
        int k=3;
        getSmallestAndLargest(s,k);

    }
}
