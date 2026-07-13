package DSA.ProblemOfDays;

import DSA.SlidingWindow.Sum_Of_Maximum_Size;

import java.util.*;

//Input: low = 100, high = 300
//Output: [123,234]

//Example 2:
//Input: low = 1000, high = 13000
//Output: [1234,2345,3456,4567,5678,6789,12345]

public class Sequential_Digits_1291 {
    public static List<Integer> sequentialDigits(int low, int high) {
                List<Integer>list =new ArrayList<>();

                    for (int i=low; i<=high; i++){
                        int n=i;
                         String st=String.valueOf(n);
                         boolean isSequence=true;
                         int j=1;
                         while (j<st.length())
                         {
                             if(st.charAt(j-1)-'0'+1!=st.charAt(j)-'0'){
                                 isSequence=false;
                                 break;
                             }
                             j++;
                         }

                         if (isSequence){
                             list.add(i);
                         }
                    }

        return list;
    }
    public static void main(String[] args) {

        int low=1000;
        int high=13000;
        long start=System.nanoTime();
        System.out.println(sequentialDigits(low,high));
        long end= System.nanoTime();

        System.out.println((end-start)/ 1000000);
    }
}
