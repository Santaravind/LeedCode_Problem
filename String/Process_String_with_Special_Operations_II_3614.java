package DSA.String;

public class Process_String_with_Special_Operations_II_3614 {
//    Build a new string result by processing s according
//    to the following rules from left to right:
//
//    If the letter is a lowercase English letter append it to result.
//    A '*' removes the last character from result, if it exists.
//    A '#' duplicates the current result and appends it to itself.
//    A '%' reverses the current result.
//    Return the kth character of the final string result. If k is out of the bounds
//    of result, return '.'.

    public static void main(String[] args) {
//        String st="a#b%*";
//        String st="fwp*m*#a%%";
//        String st="cd%#*#";
//        String st="z*#";
        String st="%#bz%xum##i##vzo#pwc*#dkwbh####%uf%s*%cgppqhqa%h#l##o%ij%%cz%iga##e###u%#e####jfwx##%%*x%m*%#";
        long k=6526;

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
                sb.deleteCharAt(j-1);
                j--;

            } else if (st.charAt(i)=='%') {
                sb.reverse();
            }
        }
        System.out.println(sb.toString()+" "+k +" "+ j);
        if (sb.isEmpty()){

            System.out.println(".");
        }else  if (j>=k){
            System.out.println(sb.charAt((int)k));
        }else {
            System.out.println(".");
        }

    }
}
