package DSA.String;

public class Reverse_Degree_of_a_String_3489 {
    public static void main(String[] args) {
        String st="zaza";
           int result=0;
//        System.out.println('z'-st.charAt(1)+1);
        for(int i=0; i<st.length(); i++){
               result+=('z'-st.charAt(i)+1)*(i+1);
//            result+=r*(i+1);
        }
        System.out.println(result);
    }
}
