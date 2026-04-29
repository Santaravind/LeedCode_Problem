package DSA.HashMapQuestion;

public class RansomNote_387 {
    public static void main(String args[]){
        String ran="aa";
        String mag="ab";
        int []ch=new int[26];
        for (int i=0; i<mag.length(); i++){
            ch[ran.charAt(i)-'a']++;
        }
        for (char c:ran.toCharArray()){
            if (ch[c-'a']==0){
//                return false;
                break;
            }
            ch[c-'a']--;
        }


//        for (int k:ch)
//        System.out.print(" " +k);

    }
}
