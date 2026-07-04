package DSA.SlidingWindow;

import java.util.HashMap;

public class Longest_Substring_With_K_Unique_Charecters {
    public static void main(String[] args) {
        String st="aabcabebebe";
        int k=3;
       int ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0; int j=0;
        while (j<st.length()){
            map.put(st.charAt(j),map.getOrDefault(st.charAt(j),0)+1);
            if (map.size()<k){
                j++;

            }else if (map.size()==k){
             ans=Math.max(ans,(j-i+1));
             j++;
            }else if(map.size()>k){
                while (map.size()>k&&i<st.length()){
                    map.put(st.charAt(i), map.get(st.charAt(i))-1);
                    if (map.get(st.charAt(i))==0){
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
