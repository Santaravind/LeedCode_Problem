package DSA.Arrays;

import java.util.HashMap;

public class Word_Pattern_290 {
    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character ,String>map=new HashMap<>();

        String st[]=s.split(" +");

        if (pattern.length()!=st.length)return  false;

        for (int i=0; i<pattern.length(); i++){
           char ch=pattern.charAt(i);
            if (map.containsValue(st[i])&&!map.containsKey(ch)){
                return false;
            }
            if (map.containsKey(ch)&&!map.get(ch).equals(st[i])){
                return false;
            }else {
                map.put(ch,st[i]);
            }
        }

return  true;

    }
    public static void main(String[] args) {
        String p="abbc";
       String s = "dog cat cat fish";



        System.out.println(wordPattern(p,s));



    }
}
