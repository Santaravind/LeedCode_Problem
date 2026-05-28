package DSA.String;

public class String_Anagram {
    public static  boolean isAnagram(String s, String t) {
        int st[]=new int[26];
        int ts[]=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        int i=0;
        while(i<s.length()){

            st[s.charAt(i)-'a']++;
            ts[t.charAt(i)-'a']++;
            i++;
        }
        for(int j=0; j<26; j++){
            if(st[j]!=ts[j]){
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]){
        String s="ggii";
        String t="eekk";
        System.out.println(isAnagram(s,t));
    }
}
