package DSA;

import java.util.HashSet;

public class LargestSubString3 {
    public static  void main(String args[]){
        String st="abcabcbb";
//        String st="pwwke";
//        String st="bbbbb";
//        String st="";
         int maxLength=0;
         int left=0;
        HashSet<Character>set=new HashSet<>();
//        char c[]=st.toCharArray();
//        if(st==""){
//            System.out.println(1);
//        }else {
//            for (int i = 1; i < c.length; i++) {
////            set.add(c[i]);
//                if (c[i] != c[i - 1]) {
//                    set.add(c[i]);
//                }
//                set.add(c[i]);
//            }
         for(int right=0; right< st.length(); right++){
             while (set.contains(st.charAt(right))){
                 set.remove(st.charAt(left));
                 left++;
             }
             set.add(st.charAt(right));
             maxLength=Math.max(maxLength,right-left+1);
         }
            System.out.println(set + " " + maxLength);



    }


}
