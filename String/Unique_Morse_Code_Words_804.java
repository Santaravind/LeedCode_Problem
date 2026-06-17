package DSA.String;

import java.util.HashSet;
import java.util.Set;

public class Unique_Morse_Code_Words_804 {
    public static void main(String[] args) {
        String ch[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//        String st[]={"gin","zen","gig","msg"};
        String st[]={"a"};

//   if(st.length==0)return 0;
   Set<String > set=new HashSet<>();
   for (String s:st){
       StringBuilder sb=new StringBuilder();
       for (int i=0; i<s.length(); i++){
           sb.append(ch[s.charAt(i)-'a']);
       }
       set.add(sb.toString());
   }

        System.out.println(set.size());


    }
}
