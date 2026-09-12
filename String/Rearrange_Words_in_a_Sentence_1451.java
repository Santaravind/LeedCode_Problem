package DSA.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Rearrange_Words_in_a_Sentence_1451 {
    public static String arrangeWords(String text) {
         text=text.toLowerCase();
           String arr[]=text.split(" +");

             Arrays.sort(arr,(a,b)->Integer.compare(a.length(), b.length() ));
//        text= String.join(" ",arr);
//
//         return text.substring(0,1).toUpperCase()+text.substring(1);

          StringBuilder sb=new StringBuilder();
          for (String s:arr){
              sb.append(s)
                      .append(" ");
          }

          text=sb.toString();

        return text.substring(0,1).toUpperCase()+text.substring(1);
    }
    public static void main(String[] args) {
//        String st="To be or not to be";
        String st="You and i";
        System.out.println(arrangeWords(st
        ));
    }
}
