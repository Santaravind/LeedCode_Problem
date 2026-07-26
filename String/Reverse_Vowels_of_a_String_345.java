package DSA.String;

public class Reverse_Vowels_of_a_String_345 {
    public static String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        char ch[]=s.toCharArray();
        String st="AEIOUaeiou";
//        while(start<end){
//            if(!st.contains(String.valueOf(s.charAt(start)))){
//                start++;
//            }
//            if(!st.contains(String.valueOf(s.charAt(end)))){
//                end--;
//            }
//            if(st.contains(String.valueOf(s.charAt(start)))&&st.contains(String.valueOf(s.charAt(end)))){
//                char temp=s.charAt(start);
//                System.out.println(temp);
//                s=s.replace(s.charAt(start),s.charAt(end));
//                s=s.replace(s.charAt(end),temp);
//                start++;
//                end--;
//            }
//        }
        while (start<end){
            if (!st.contains(String.valueOf(ch[start]))){
                start++;
            }
            if (!st.contains(String.valueOf(ch[end]))){
                end--;
            }
            if(st.contains(String.valueOf(ch[start]))&&st.contains(String.valueOf(ch[end]))){
                char temp=ch[start];
//                System.out.println(temp);
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }

        return String.valueOf(ch);

    }
    public static void main(String[] args) {
//             String s="IceCreAm";
             String s="leetcode";

        System.out.println(reverseVowels(s));
    }
}
