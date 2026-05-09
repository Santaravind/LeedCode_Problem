package DSA.String;

public class Reverse_words_in_a_String_151 {
    public static void main(String args[]){
//        String s="the sky is blue";
        String s=" hello world ";
        int n=s.length();
        System.out.println(reverseWords(s));

//        char []ch=s.toCharArray();
//        int first=0;
//        int last=n-1;
//        StringBuilder st=new StringBuilder();
//        StringBuilder st1=new StringBuilder();
//        while(first<last){
//            do{
//                st.append(ch[first]);
//                first++;
//            }while (ch[first]!=' ');
////            System.out.println(st);
//            do{
//                st1.append(ch[last]);
//                last--;
//            }while (ch[last]!=' ');
////            System.out.println(st1);
//            st1.reverse();
//              if (first<last) {
//                  StringBuilder temp = st;
//                  st = st1;
//                  st1 = temp;
//
//              }
//
//            System.out.println(st+""+st1);
//        }
//        System.out.println(s);
//        System.out.println(st +" "+ st1);


    }

    public static  String reverseWords(String s){
        String []words=s.split(" +");
        StringBuilder st=new StringBuilder();
        for (int i=words.length-1; i>=0; i--){
            st.append(words[i]);
            st.append(" ");
        }
        return st.toString().trim();
    }
}
