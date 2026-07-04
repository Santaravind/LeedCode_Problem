package DSA.SlidingWindow;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
//        String st="pwwetep";
//        String st="abcabce";
        String st="abcabcbb";
        HashMap<Character,Integer>map=new HashMap<>();
        int j=0,i=0;
        int ans=Integer.MIN_VALUE;


        while (j<st.length()){
            map.put(st.charAt(j),map.getOrDefault(st.charAt(j),0)+1);

            if (map.size()==(j-i+1)){
                ans=Math.max(ans,(j-i+1));
                j++;
            }else if (map.size()<(j-i+1)){
              while (map.size()<(j-i+1)) {
                  map.put(st.charAt(i), map.get(st.charAt(i)) - 1);
                  if (map.get(st.charAt(i)) == 0) {
                      map.remove(st.charAt(i));
                  }
                  i++;
              }
              j++;
            }
        }

        System.out.println(ans);
    }
}
