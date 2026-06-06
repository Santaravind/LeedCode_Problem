package DSA.String;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Is_Subsequence_392 {
    public static boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) return true;
        char ch[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        int i=0;
        int j=0;
        while(i<ch.length&&j<ch2.length){
                if (ch[i]==ch2[j]){
                    i++;
                    j++;
                }else{
                    j++;
                }
        }
        if (i==ch.length){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
//        String s="abc";
//        String t="ahbgdc";
        String t= "";
        String s = "abc";
        System.out.println(isSubsequence(s,t));
        List<Integer> ls=new LinkedList<>();
    }
}
