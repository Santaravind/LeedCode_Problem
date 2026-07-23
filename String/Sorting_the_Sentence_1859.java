package DSA.String;

public class Sorting_the_Sentence_1859 {
    public static String sortSentence(String s) {
        String []st=s.split(" +");
         String []str=new String[st.length];

        for (String v:st) {
            int i=v.charAt(v.length()-1)-'0';
           v= v.replace(String.valueOf(i),"");
            str[i-1]=v;
        }

//        for (String x : str)
//            System.out.print(x+" ");

        return String.join(" ",str);
    }
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";

        System.out.println(sortSentence(s));
    }
}
