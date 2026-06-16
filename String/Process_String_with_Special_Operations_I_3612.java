package DSA.String;

public class Process_String_with_Special_Operations_I_3612 {
//    If the letter is a lowercase English letter append it to result.
//    A '*' removes the last character from result, if it exists.
//    A '#' duplicates the current result and appends it to itself.
//            A '%' reverses the current result.
    public static void main(String[] args) {
        String st="a#b%*";
//        String st="ztv#*l";

        int j=0;
        if(st.isEmpty()) System.out.println("hello");
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<st.length(); i++){

            if (st.charAt(i)>='a'&&st.charAt(i)<='z'){
                sb.append(st.charAt(i));
                j++;
            } else if (st.charAt(i)=='#') {
                if (j-1>=0) {
                    j+=sb.length();
                   sb.append(sb.toString());

                }
            } else if (st.charAt(i)=='*') {
//                if (sb.length()-1>0) {
//                    sb.deleteCharAt(sb.length()-1);
//                    j--;
//                }
                sb.deleteCharAt(j-1);
                j--;

            } else if (st.charAt(i)=='%') {
                 sb.reverse();
            }
        }

        System.out.println(sb.toString());
    }
}
