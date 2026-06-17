package DSA.String;

public class Excel_Sheet_Column_Number_171 {
    public static void main(String[] args) {
        String st="A";
        int n=st.length();
        int result=0;
        int j=n-1,i=0;


        while (j>=0){

            result = (int) (result+(((st.charAt(j)-'A')+1)*Math.pow(26,i)));

            System.out.println(st.charAt(i)-'A'+1);
            System.out.println(Math.pow(26,i));
            j--;
            i++;
        }
        System.out.println(result);
    }
}
