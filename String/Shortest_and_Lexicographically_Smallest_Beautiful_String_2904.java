package DSA.String;

public class Shortest_and_Lexicographically_Smallest_Beautiful_String_2904 {
    public static String shortestBeautifulSubstring(String s, int k) {

        return  " ";
    }
    public static void main(String[] args) {
//        Input: s = "100011001", k = 3
//        Output: "11001"

//        String s="100011001";
        String s="001110101101101111";
        int k=10;

         char ch[]=s.toCharArray();
         String ans="";
        for (int i=0;  i<ch.length; i++){
            int m=k;
            StringBuilder st=new StringBuilder();
            for (int j=i; j<ch.length; j++){
                st.append(ch[j]);
                if (ch[j]-'0'==1){
                    m--;
                }
                if (m==0){
                    break;
                }
            }
           if (m==0&&(ans.isEmpty()||(ans.length()>st.length()))){
               ans=st.toString();
           }

        }

        System.out.println(ans);

//        001110101101101111
//        "11101011011011" : output
//        "10101101101111"
    }
}
