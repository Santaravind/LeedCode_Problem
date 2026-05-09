package DSA.String;

import java.util.HashMap;

public class Isomorphic_String_205 {
    public static void main(String args[]){
        String s="egg";
        String t="add";

        if (s.length()!=t.length()){
            System.out.println("is not isomorphic false");
        }

        HashMap<Character, Integer>map=new HashMap<>();
        int count=1;
        int j=0;

        while (j!=s.length()-1){
            map.put(s.charAt(j),count++);
            if (map.containsValue(s.charAt(j))){
                map.put(s.charAt(j),count++);
            }
            j++;
        }
        System.out.println(map);
        System.out.println(map.get('e'));
        System.out.println(map.values());
    }
}
