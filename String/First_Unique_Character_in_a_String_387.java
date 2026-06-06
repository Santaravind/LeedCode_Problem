package DSA.String;

public class First_Unique_Character_in_a_String_387 {

    public static int firstUniqChar(String s) {
        int count =-1;

           for(int i=0; i<s.length(); i++){
               char c=s.charAt(i);
               if (s.indexOf(c)==s.lastIndexOf(c)){
                   return i;
               }
           }


        return count;
    }
    public static void main(String[] args) {
//        String s="leedcode";
//        String s="loveleetcode";
        String s="aabb";

        System.out.println(firstUniqChar( s));

    }
}
