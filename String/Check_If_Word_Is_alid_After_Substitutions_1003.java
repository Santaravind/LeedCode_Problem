package DSA.String;

public class Check_If_Word_Is_alid_After_Substitutions_1003
{
    public static void main(String[] args) {
        String st="aabcbc";


        while (st.contains("abc")){
            st=st.replace("abc","");
        }

        System.out.println(st.isEmpty());
    }
}
