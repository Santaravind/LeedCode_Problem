package DSA;

public class Check_of_Operations_I_2839 {
    public static  void main(String args[]){
//        String s1="abcd";
//        String s2="cdab";
           String s1= "zrmq";
           String s2="mrzq";
        int j=s1.length()-1;
//        int i=0;
        char ch[]=s1.toCharArray();
        while(j>=0){
            for(int i=0; i<ch.length; i++) {
                if (j - i == 2) {
                    char c = ch[i];
                    ch[i] = ch[j];
                    ch[j] = c;
                }
            }

            j--;

            s1=String.valueOf(ch);
            System.out.println(ch);
            if (s1.equals(s2)){
//            return true;
                System.out.println(true);
            }

        }
        System.out.println(false);

        System.out.println(((((s1.charAt(0)==s2.charAt(0))&&(s1.charAt(2)==s2.charAt(2)))
                ||((s1.charAt(0)==s2.charAt(2))&&(s1.charAt(2)==s2.charAt(0))))
                &&(((s1.charAt(1)==s2.charAt(1))&&(s1.charAt(3)==s2.charAt(3)))
                || ((s1.charAt(1)==s2.charAt(3))&&(s1.charAt(3)==s2.charAt(1))))));

//        ch.toString();
//         s1=String.valueOf(ch);
//        System.out.println(ch);
//        if (s1.equals(s2)){
////            return true;
//            System.out.println(true);
//        }else {
////            return false;
//            System.out.println(false);
//        }
    }
}
