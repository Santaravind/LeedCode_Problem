package DSA.String;

public class Reverse_String_II_541 {

    public static String reverseStr(String s, int k) {

         int n=s.length();
         char []ch=s.toCharArray();

              for (int i=1; i<k; i++)  {
                  if (n>k&&i<k) {
                      char temp = ch[i];
                      ch[i] = ch[i - 1];
                      ch[i - 1] = temp;
                  }else if (n>k*k+2){
                      if (i>k*k+1||i<k*k+2) {
                          char temp = ch[i];
                          ch[i] = ch[i - 1];
                          ch[i - 1] = temp;
                      }
                  }

         }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String st="abcdefg";
        int k=2;

        System.out.println(reverseStr(st,k));


    }
}
