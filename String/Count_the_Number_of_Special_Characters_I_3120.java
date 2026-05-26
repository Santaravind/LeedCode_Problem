package DSA.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Count_the_Number_of_Special_Characters_I_3120 {
    public static void main(String args[]){
        String word="aabBDaC";
       char []ch=word.toCharArray();
       int count=0;
        int i=0;
//        Set<Character> st=new HashSet<>();
//        st.add(ch[i]);
//        System.out.println(st);
        while (i<word.length()-1){
            if (Character.isLowerCase(word.charAt(i))){
                char c=Character.toUpperCase(word.charAt(i));
               if (word.contains(String.valueOf(c))){
                   count ++;
               }
            }
            i++;
        }
        System.out.println(count);
//        Arrays.sort(ch);
//        System.out.println(ch);
    }
}
