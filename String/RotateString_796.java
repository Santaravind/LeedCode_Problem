package DSA.String;

public class RotateString_796 {
    public static boolean rotateString(String s, String goal){

//        this code is working written by Me
//           char ch[]=s.toCharArray();
//           int j=0;
//           while(j<ch.length) {
//               char c = ch[0];
//               for (int i = 0; i < ch.length - 1; i++) {
//                   ch[i] = ch[i + 1];
//               }
//               ch[ch.length - 1] = c;
//               if (String.valueOf(ch).equals(goal)){
//                   return true;
//               }
//               j++;
//           }

        if(s.length() != goal.length()) return false;

        s= s+s;
        if(s.indexOf(goal) != -1) return true;
        return false;

    }
    public static void main(String args[]){
        String s="abcde";
        String goal="cdeab";

        System.out.println(rotateString(s,goal));
    }
}
