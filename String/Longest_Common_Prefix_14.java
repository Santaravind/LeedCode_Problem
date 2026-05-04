package DSA.String;

import java.util.Arrays;

public class Longest_Common_Prefix_14 {
    public static void main(String args[]){
        String s[]={"flower","flow","flight"};

        StringBuilder result=new StringBuilder();
        Arrays.sort(s);
        char [] first=s[0].toCharArray();
        char [] last=s[s.length-1].toCharArray();

        for (int i=0; i<s[0].length(); i++){
            if (first[i]!=last[i]) break;

            result.append(first[i]);

        }

        System.out.println(result);
        // how iterate it
        for (String st:s){
            for (int j=0; j<st.length(); j++){
                  System.out.print(st.charAt(j));
            }
            System.out.println(" ");
        }

//        for (int i=0; i<s.length; i++){
//            for (int j=0; j<s[i].length(); j++){
//
//            }
//        }
    }
}
